import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		int count =0;
		char [] Asave = new char[3];
		char [] Bsave = new char[3];
		
		String A_reversenumber ="";
		String B_reversenumber ="";
		
		for(int i=3; i>0; i--) {
			Asave[count]= A.charAt(i-1);
			Bsave[count]=B.charAt(i-1);
			count++;
		}
        
		for (int i=0; i<Asave.length; i++) {
			A_reversenumber+=Asave[i];
			B_reversenumber+=Bsave[i];
		}
		
		int compare = Integer.parseInt(A_reversenumber);
		int compare1= Integer.parseInt(B_reversenumber);
		
		if(compare>compare1) {
			System.out.println(compare);
		}else {
			System.out.println(compare1);
		}
        
    }
    
}