package CodeForces;

import java.util.Scanner;

public class Tram {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = input.nextInt();
			b[i] = input.nextInt();
		}
		int neededCapacity = 0;
		int totalPassengers = 0;
		for (int i = 0; i < n; i++) {
			totalPassengers = totalPassengers - a[i] + b[i];
			if(totalPassengers > neededCapacity){
				neededCapacity = totalPassengers;
			}
		}
		System.out.println(neededCapacity);
	}
}
