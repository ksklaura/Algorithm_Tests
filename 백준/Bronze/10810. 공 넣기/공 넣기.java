import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int [] boxArry = new int[N];
        
        for(int a = 0; a < M; a++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
            
            for(int b=i-1; b<=j-1; b++){
                boxArry[b] = k;
            }
        }
        
        for(int i: boxArry){
            System.out.printf("%d ", i);
        }
        
    }
}