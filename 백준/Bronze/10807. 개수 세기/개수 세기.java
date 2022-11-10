import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String [] numbers = br.readLine().split(" ");
		int search = Integer.parseInt(br.readLine());
		int cnt = 0; 									// 찾고자 하는 정수 갯수의 합
		
		for(int i=0; i<N; i++) {
			int v = Integer.parseInt(numbers[i]);		// 나열된 숫자 하나씩 가져오기
			if(v == search) {							// 찾는 정수와 일치하는 숫자가 나오면 count 하나씩 증가 
				cnt++;
			}
		}
		
		System.out.println(cnt);
		br.close();

	}

}