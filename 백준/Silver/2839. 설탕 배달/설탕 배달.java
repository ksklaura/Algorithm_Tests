import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;//한 줄에 두 수 이상을 받아오기 위해 들여옵니다.
import java.util.*;
import java.text.*;

public class Main{
    
	public static void main(String []args) throws IOException {
        
		Scanner scanner=new Scanner(System.in);
		int N=scanner.nextInt();
		int min=-1;
		int fiveCount=N/5;
        
		while(fiveCount>=0) {
            
			if((N-fiveCount*5)%3==0) {
				min=fiveCount+(N-fiveCount*5)/3;
				break;
			}
			else {
				fiveCount-=1;
			}
            
		}
        
		System.out.println(min);
	}
	
}