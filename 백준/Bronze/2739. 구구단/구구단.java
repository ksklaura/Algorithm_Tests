import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		br.close();
		
		int x = Integer.parseInt(str);
		
		for(int i=1; i<=9; i++) {
			System.out.println(x + " * " + i + " = " + (x*i));
		}
	}

}