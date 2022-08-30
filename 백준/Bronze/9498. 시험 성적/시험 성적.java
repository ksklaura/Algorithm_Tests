import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		x = sc.nextInt();
		
		if((x < 101) && (x > 89)) {
			System.out.println("A");
		}else if((x < 90) && (x > 79)) {
			System.out.println("B");
		}else if((x < 80) && (x > 69)) {
			System.out.println("C");
		}else if((x < 70) && (x > 59)) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}

}