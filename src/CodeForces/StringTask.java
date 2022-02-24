package CodeForces;

import java.util.Scanner;
public class StringTask {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        s = s.toLowerCase();
        String result = "";
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='y') {

            }
            else {
                result = result + "." + s.charAt(i);
            }
        }
        System.out.println(result);
    }

}
