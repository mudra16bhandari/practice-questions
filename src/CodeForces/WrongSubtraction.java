package CodeForces;

import java.util.Scanner;

public class WrongSubtraction {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		long number = input.nextLong();
		int k = input.nextInt();
		for (int i = 0; i < k; i++) {
			if(number % 10 == 0){
				number = number / 10;
			}
			else{
				number -= 1;
			}
		}
		System.out.println(number);
	}
}
