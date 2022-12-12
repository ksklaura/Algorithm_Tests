import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    
    public static void main(String[] args) throws IOException {
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int sum = 0;

        String numbers = br.readLine();

        for(int i=0; i<N; i++){
            sum += numbers.charAt(i) - '0'; // charAt() 은 해당 문자의 아스키코드 값을 반환하므로 
                                            // 반드시 -48 또는 -'0' 을 해주어야 우리가 입력받은 숫자 값 그대로를 사용 가능!
                                            // charAt은 char형으로 반환하지만 int미만의 자료형이 연산하면 int형이 된다!
        }
        System.out.println(sum);
    }
}
