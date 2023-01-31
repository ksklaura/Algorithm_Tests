import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        long nec_move = (V-A);
        long day_move = (A-B);

        if(nec_move%day_move == 0){
            System.out.println(nec_move/day_move +1);
        }else {
            System.out.println(nec_move/day_move +2);
        }
        
    }

}