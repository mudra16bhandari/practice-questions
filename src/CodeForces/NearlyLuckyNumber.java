package CodeForces;

import java.util.Scanner;

public class NearlyLuckyNumber {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		long number = input.nextLong();
		int luckyNumberCount = 0;

		while (number != 0){
			if(number % 10 == 7 || number % 10 == 4){
				luckyNumberCount++;
			}
			number = number / 10;
		}

		if(luckyNumberCount == 7 || luckyNumberCount == 4){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}
}
