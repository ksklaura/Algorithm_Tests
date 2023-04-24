import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int M = s.nextInt();
		int[] arr=new int[N];
		for(int i=0;i<N;i++)
			arr[i]=(i+1);
		int cnt=0;
		while(cnt<M) {
			int i = (s.nextInt()-1);
			int j = (s.nextInt()-1);
			while(j>i) {
				int tmp=arr[i];
				arr[i]=arr[j];
				arr[j]=tmp;
				j--;
				i++;
			}
			cnt++;
		}
		for(int i=0;i<N;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}