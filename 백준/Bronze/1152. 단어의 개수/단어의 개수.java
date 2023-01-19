import java.util.Scanner;

public class Main{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().trim();    //입력받은 문자의 앞뒤 공백제거	
        int count =1;
		
		if(str.isEmpty()) {    //단어가 입력되지 않았을 때 count(단어의갯수)를 0으로 만듬
			count=0;
		}
		for (int i=0; i<str.length(); i++) {
			 if(str.charAt(i)==32) {
				count++;
			}
		}
		System.out.println(count);
	}
}