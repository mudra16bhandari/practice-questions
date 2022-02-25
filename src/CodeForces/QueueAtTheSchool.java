package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class QueueAtTheSchool {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int t = input.nextInt();
		String s = input.next();
		char[] charS = s.toCharArray();
		for (int i = 0; i < t; i++) {
			for (int j = 0; j < n-1; j++) {
				if(charS[j] == 'B' && charS[j+1] == 'G'){
					charS[j] = 'G';
					charS[j+1] = 'B';
					j++;
				}
			}
		}
		System.out.println(String.copyValueOf(charS));
	}
}
