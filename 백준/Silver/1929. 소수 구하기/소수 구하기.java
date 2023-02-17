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
		int m=scanner.nextInt();
		int n=scanner.nextInt();
		boolean isSosu[]=new boolean[n+1];
        
		for(int i=0;i<=n;i++) {
			isSosu[i]=true;
		}
        
		isSosu[0]=false;
		isSosu[1]=false;
		
        for(int i=2;i<=n;i++) {
			if(!isSosu[i]) {
				continue;
			}
			else {
				for(int j=i+i;j<=n;j+=i) {
					isSosu[j]=false;
				}
			}
		}
		
        for(int i=m;i<=n;i++) {
			if(isSosu[i]) {
				System.out.println(i);
			}
		}
		
	}
	
}