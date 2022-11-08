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
		
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String str;
		
		int a;
		int b;
		
		while((str = br.readLine()) != null) { 		// str 문자열 변수에 입력한 문자를 할당하여 null인지 확인
								// readLine() 을 통해 입력을 하여 str 에 저장된 데이터가 null 일 경우 while 반복문을 종료시켜버리고 아닐 경우 반복문을 계속 수행
			st = new StringTokenizer(str, " "); 	// null이 아니라면 해당 문자열을 " "로 구분
			
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			sb.append(a+b).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
