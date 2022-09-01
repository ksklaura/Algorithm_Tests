import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H, M;
		H = sc.nextInt();
		M = sc.nextInt();
		
		if((M-45) < 0) {
			M = (M+15);
			
			if((H-1) < 0) {
				H = 23;
			}else {
				H = H-1;
			}
			
		}else {
            M = M-45;
        }
		
		System.out.println(H+" "+M);
		sc.close();
	}

}