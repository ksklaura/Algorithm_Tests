import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour =sc.nextInt();
		int minute = sc.nextInt();
		int addMinute = sc.nextInt();
        sc.close();
		
		int t_m = hour * 60 + minute + addMinute;
		hour = t_m/60;
		minute = t_m %60;
		
		if(hour >=24) {
			hour = hour - 24;
		}
		
		System.out.println(hour + " " + minute);
	}

}