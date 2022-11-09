import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int cnt = 0;			// 반복문이 몇 번 반복되었는지 세어주는 변수 count
		int copy = N; 			// 처음 입력한 값을 복사한 변수 copy
        
		do {
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			cnt++;
		} while (copy != N);	// 처음 입력값과 새로운 변수가 같을 경우 반복문 종료
								// 최소 1번은 반복문이 돌아야 하기 때문에 while문이 아닌 do-while문을 사용함.
								// 괄호를 치는 이유 : 
								// 자바에서는 Casting (캐스팅) 을 해주어야 할 때가 생김. (또는 형 변환)
								// 이럴 때 괄호는 매우 중요한 역할을 하는데, 괄호가 캐스팅보다 우선순위임.
								// 그렇기 때문에 연산 순서라던가 어떤 알고리즘에 있어 순서도가 중요한 경우 
								// 괄호를 쳐주는 것이 명시적으로 우선순위를 두는 것이기 때문에 괄호를 쳐주는 것이 좋음.
		
		System.out.println(cnt);
	}

}