import java.util.Scanner;

public class Main{
   public static void main(String[] args) {
	   
	   Scanner sc=new Scanner(System.in);  // 스캐너 객체를 생성함.
	   int input=sc.nextInt();             // input값을 가져옴.
	   int cnt=input;                      // cnt에 input값을 가져옴.
	   
	   for(int i=2; i<=cnt; i++) {           // 소인수분해는 가장 처음 소수인 2부터 시작함.
		   if(input%i==0) {                // 입력값에서 i를 나눴을때 0이 나오면 조건문을 실행함.
			   input=input/i;              // input에서 2를 나눠준 값을 input에 넣음.
			   System.out.println(i);      // i를 출력함.
			   i-=1;                       // 소인수 분해이기때문에 -1을 해줘서 다시 돌아가 체크함.
		   }
		   if(input==1) break;             // 마지막 값이 1이 나오면 반복문을 벗어남.
	   }
	}
}