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
		
		StringTokenizer st; 							// 입력받은 두 수를 분리하기 위해 StringTokenizer 사용 
		StringBuilder sb = new StringBuilder();			// 더하기 값을 한번에 산출하기 위해 StringBuilder 사용
		int a;
		int b;
		
		while(true) {									// 무한반복
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			if(a==0 && b==0) break;
			sb.append((a+b)+"\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();

	}

}