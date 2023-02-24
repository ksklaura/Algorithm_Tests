import java.util.*;

public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i=1; i<=num; i++) {
            if(num % i == 0)
                list.add(i);
        }
        
        if(list.size() < num2)
            System.out.println(0);
        else
            System.out.println(list.get(num2-1));
    }
}