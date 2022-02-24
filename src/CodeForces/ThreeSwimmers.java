package CodeForces;

import java.util.Arrays;
import java.util.Scanner;
public class ThreeSwimmers {
	static void findResult(long p, long a, long b, long c){
		long[] total = new long[]{0,0,0};

		total[0] = a - p%a;
		total[1] = b - p%b;
		total[2] = c - p%c;

		Arrays.sort(total);

		if(p%a==0 || p%b==0 || p%c==0){
			System.out.println(0);
		}
		else{
			System.out.println(total[0]);
		}

	}
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		int testCases = input.nextInt();
		for (int i = 0; i < testCases; i++) {
			long p = input.nextLong();
			long a = input.nextLong();
			long b = input.nextLong();
			long c = input.nextLong();
			findResult(p,a,b,c);
		}

	}
}
