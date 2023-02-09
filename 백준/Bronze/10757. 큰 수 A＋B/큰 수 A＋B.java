import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;  // 한 줄에 두 수 이상을 받아오기 위해 들여옴.
import java.util.*;
import java.text.*;

public class Main{
    
	public static void main(String []args) throws IOException {
        
		Scanner scanner=new Scanner(System.in);
        
		String A=scanner.next();
		String B=scanner.next();
		String C="";
		int i=A.length()-1;
		int j=B.length()-1;
		boolean isHaveSip=false;
        
		while(i>=0||j>=0) {
			int t=0;
            
			if(i>=0&&j>=0) {
			    char a=A.charAt(i);
			    char b=B.charAt(j);
			     t=a-'0'+b-'0';
			}
			else if(i>=0) {
				char a=A.charAt(i);
				t=a-'0';
			}
			else if(j>=0) {
				char b=B.charAt(j);
				t=b-'0';
			}
            
			if(isHaveSip) {
				t=t+1;
			}
            
            
			if(t>=10) {
				isHaveSip=true;
			}
			else {
				isHaveSip=false;
			}
			
            C = String.valueOf(t%10)+C;
			i--; j--;
		}
		if(isHaveSip) {
			C=String.valueOf(1)+C;
		}
		System.out.println(C);
	}
	
}