import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine()); // 첫번째 입력 N, X
		
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		int A[] = new int[N];
		StringTokenizer num = new StringTokenizer(br.readLine()); // 두번째 입력 A[N].length
		
		for(int i=0; i<N; i++) {
			A[i] = Integer.parseInt(num.nextToken());
			
			if(A[i]< X) {
				bw.write(A[i]+" ");
			}
			
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
