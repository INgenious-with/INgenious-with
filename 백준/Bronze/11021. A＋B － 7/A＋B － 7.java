import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int T = in.nextInt();
		int N = 0;
		
		for(int i=0; i<T; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int c = a+b;
			N++;
			System.out.println("Case #" +N+": "+c);
			
		}
	}
}