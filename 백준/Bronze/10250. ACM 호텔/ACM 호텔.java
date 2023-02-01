import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {
	
		Scanner sc = new Scanner(System.in);
		int test=sc.nextInt();
		
		for (int z=0; z<test; z++) {
		
            int height = sc.nextInt();
		    int width = sc.nextInt();
		    int customer =sc.nextInt();

		    int count =0;
		    int [] save = new int[10000];
            
		    for (int i=1; i<=width; i++) {
			    for( int j=1; j<=height; j++) {
				    save[count]=( (j*100) +i );
				    count++;
			    }
		    }
            
		    System.out.println(save[customer-1]);
            
		}
	}
}