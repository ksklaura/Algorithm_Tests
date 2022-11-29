import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = 0;
        int arr[];

        int C = Integer.parseInt(br.readLine());

        StringTokenizer st;
        
        for(int i=0; i<C; i++){
            st = new StringTokenizer(br.readLine(), " ");
            N = Integer.parseInt(st.nextToken());
            arr = new int[N];

            double sum = 0;

            for(int j=0; j<N; j++){
                arr[j] = Integer.parseInt(st.nextToken());
                sum += arr[j];
            }

            double avg = 0;
            avg = sum / N;

            double cnt = 0;

            for(int p=0; p<N; p++){
                if(avg < arr[p]){
                    cnt++;
                }
            }
            System.out.printf("%.3f%%\n",((cnt/N)*100));
        }
	}
}