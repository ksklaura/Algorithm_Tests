import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int n = 0;
		int sum;
        
		while(true) {
			n++;
			sum = n*(n+1)/2;
			if(sum>=num)
				break;
		}
        
		int chart = num-n*(n-1)/2;
        
		if(n%2==0) {
			System.out.println(chart+"/"+(n-chart+1));
		} else {
			System.out.println((n-chart+1)+"/"+chart);
		}
        
	}
}