import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[10];
		boolean bl; 								// n번째와 n+1번째를 비교하기 위한 변수
		int cnt = 0; 								// 서로 다른 나머지들의 개수를 측정하기 위한 변수

		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine()) % 42;
		}
		
		for(int i=0; i<10; i++) {
			bl = false; 							// 기본값을 false로 설정
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) { 				// 배열의 n번째와 n+1번째의 값을 비교
					bl = true; 						// 같다면 bl값을 true로 변경
					break; 							// 한번만 비교하면 되니 조건이 성립하면 벗어나기
				}
			}
			if(bl == false) {
				cnt++; 								// bl의 값이 거짓일 때 카운트를 1증가
			} 										// 만약 true면 나머지가 서로 같다는 뜻이니 카운트를 올릴 필요 x
		}

		System.out.println(cnt);
	
	}
}
