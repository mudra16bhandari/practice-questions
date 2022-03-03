package CodeForces;

import java.util.Scanner;

public class AntonAndDanik {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		long num = input.nextLong();
		String s = input.next();
		long countForA = 0;
		for (int i = 0; i < num; i++) {
			if(s.charAt(i) == 'A'){
				countForA++;
			}
		}
		if(countForA > num - countForA){
			System.out.println("Anton");
		}
		else if(countForA < num - countForA){
			System.out.println("Danik");
		}
		else{
			System.out.println("Friendship");
		}
	}
}
