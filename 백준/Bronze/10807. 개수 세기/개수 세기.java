import java.util.Scanner;

public class Main {
	 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int[] array = new int[N];
		int cnt = 0;
		
		for(int i=0; i<N; i++) {
			array[i] = in.nextInt();
		}
		
		int a = in.nextInt();
		
		for(int i=0; i<array.length; i++) {
			if(a ==array[i]) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
	}
}