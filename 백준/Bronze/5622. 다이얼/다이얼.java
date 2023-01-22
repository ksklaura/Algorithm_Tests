import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum=0;
		String st = sc.next();
		
		st = st.replaceAll("A","2");
		st = st.replaceAll("B","2");
		st = st.replaceAll("C","2");
		st = st.replaceAll("D","3");
		st = st.replaceAll("E","3");
		st = st.replaceAll("F","3");
		st = st.replaceAll("G","4");
		st = st.replaceAll("H","4");
		st = st.replaceAll("I","4");
		st = st.replaceAll("J","5");
		st = st.replaceAll("K","5");
		st = st.replaceAll("L","5");
		st = st.replaceAll("M","6");
		st = st.replaceAll("N","6");
		st = st.replaceAll("O","6");
		st = st.replaceAll("P","7");
		st = st.replaceAll("Q","7");
		st = st.replaceAll("R","7");
		st = st.replaceAll("S","7");
		st = st.replaceAll("T","8");
		st = st.replaceAll("U","8");
		st = st.replaceAll("V","8");
		st = st.replaceAll("W","9");
		st = st.replaceAll("X","9");
		st = st.replaceAll("Y","9");
		st = st.replaceAll("Z","9");
		
		for(int i=0;i<st.length();i++) {
			sum += Integer.parseInt(st.substring(i,i+1));
		}

		System.out.println(sum+st.length());
		
	}
}