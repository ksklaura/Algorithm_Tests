import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		double[] grades = new double[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i=0; i<N; i++) {
			grades[i] = Integer.parseInt(st.nextToken());		// 입력한 점수를 배열에 넣기
		}
		
		Arrays.sort(grades);									// 배열을 오름차순으로 정렬
		
		double M = grades[grades.length - 1];					// 배열의 마지막 인덱스 위치 = 최대값
		double sum = 0.0;
		double avg = 0.0;
		
		for (int i=0; i<N; i++) {
			sum += grades[i]/M*100;								// 조작한 점수로 재계산하여 합 구하기
		}
		
		avg = sum/N;
		
		System.out.println(avg);
		
	}

}