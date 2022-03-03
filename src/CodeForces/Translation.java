package CodeForces;

import java.util.Scanner;

public class Translation {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String s = input.next();
		String t = input.next();
		int i, j = t.length() - 1;
		boolean result = true;
		if(s.length() == t.length()){
			for (i = 0; i < s.length(); i++,j--) {
				if(s.charAt(i) != t.charAt(j)){
					System.out.println("NO");
					result = false;
					break;
				}
			}
		}
		else {
			System.out.println("NO");
			result = false;
		}
		if(result){
			System.out.println("YES");
		}
	}
}
