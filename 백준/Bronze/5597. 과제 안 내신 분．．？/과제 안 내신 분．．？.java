import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] students = new int[31];  					// 28개의 번호를 담을 배열 선언. 남은 값은 0으로 들어감.
														// 배열을 30까지만 설정할 경우 29까지만 들어가기 때문에 31로 설정함.
		
		for (int i=1; i<=28; i++) {     				// 입력은 for문이 돌아갈 때 같이 입력받지 않으면 첫 입력값만 받게됨.
			int n = Integer.parseInt(br.readLine());
			students[n]++;
		}
		
		for (int i=1; i<students.length; i++) {			// i=1부터 시작해야 함. 0부터 시작했을 때 0이 출력됨. 
			if (students[i] == 0) {						// 1로 바꿨을 때 배열의 길이는 30이 아니라 31이여야 함. 
				System.out.println(i);					// 30으로 했을 때 students.length까지 받았을 때 1개만 나옴.
			}
		}

	}

}