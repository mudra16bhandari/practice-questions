package CodeForces;

import java.util.Scanner;
public class Football {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		String s = input.next();
		int count = 0;
		for (int i = 0; i < s.length()-1; i++) {
			if(s.charAt(i) == s.charAt(i+1)){
				count++;
			}
			else{
				count = 0;
			}
			if(count+1==7){
				break;
			}
		}
		if(count+1 == 7){
			System.out.print("YES");
		}
		else{
			System.out.print("NO");
		}
	}
}
