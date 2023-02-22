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
		boolean isSosu[]=new boolean[10001];
		
        for(int i=0;i<=10000;i++) {
			 isSosu[i]=true;
		}
		
        isSosu[0]=false;
		isSosu[1]=false;
		
        for(int i=2;i<=10000;i++) {
		    if(!isSosu[i]) {
				 continue;
			 }
			 else {
				 for(int j=i+i;j<=10000;j+=i) {
					 isSosu[j]=false;
				 }
			 }
		}
		
        List<Integer> li1=new Vector<Integer>();
		List<Integer> li2=new Vector<Integer>();
		int tc=scanner.nextInt();
		
        for(int i=0;i<tc;i++) {
			int n=scanner.nextInt();
			int first=0;
			int second=0;
			 
            for(int k=2;k<=n/2;k++) {
				 if(isSosu[k]&&isSosu[n-k]) {
					 first=k;
					 second=n-k;
				 }
			}
			li1.add(first);
			li2.add(second);
		}
		
        for(int i=0;i<tc;i++) {
			System.out.println(li1.get(i)+" "+li2.get(i));
		}
		
	}
	
}