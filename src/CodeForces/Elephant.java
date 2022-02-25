package CodeForces;

import java.util.Scanner;
public class Elephant {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		long coordinate = input.nextLong();
		if(coordinate < 6){
			System.out.println(1);
		}
		else{
			long steps = (coordinate/5);
			if (coordinate % 5 == 0) {
				System.out.println(steps);
			} else {
				System.out.println(steps + 1);
			}
		}
	}
}
