import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = "";
		input = br.readLine();
		
		String addChar = "??!";
		
		System.out.println(input+addChar);
		
		br.close();
	}

}