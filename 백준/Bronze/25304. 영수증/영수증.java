import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int n = sc.nextInt();
		int c = 0;
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<2; j++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				
				c = a*b;
			}
			sum += c;
		}
		
		if(x == sum) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

		sc.close();
	}

}