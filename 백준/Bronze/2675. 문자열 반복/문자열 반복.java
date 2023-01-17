import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        
        for(int i=0;i<cnt;i++) {
            
            int num = sc.nextInt();
            String st = sc.next();
            String str = "";
            
            for(int j=0;j<st.length();j++) {
                
                for(int k=0;k<num;k++) {
                    
                    System.out.print(st.charAt(j));
                    
                }
                
            }
            
            System.out.println();
            
        }
        
    }
    
}

