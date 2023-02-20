import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;
import java.text.*;
public class Main{
	
	public static void main(String []args) throws IOException {
		Scanner scanner=new Scanner(System.in);
		 boolean isSosu[]=new boolean[123456*2+1];
		 for(int i=0;i<=123456*2;i++) {
			 isSosu[i]=true;
		 }
		 isSosu[0]=false;
		 isSosu[1]=false;
		 for(int i=2;i<=123456*2;i++) {
			 if(!isSosu[i]) {
				 continue;
			 }
			 else {
				 for(int j=i+i;j<=123456*2;j+=i) {
					 isSosu[j]=false;
				 }
			 }
		 }
		 List<Integer> li=new Vector<Integer>();
		while(true) {
			int k=scanner.nextInt();
			if(k==0) {break;}
			int count=0;
			for(int i=k+1;i<=2*k;i++) {
				if(isSosu[i]) {
					count++;
				}
			}
			li.add(count);
			
		}
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
		
	}
	
}