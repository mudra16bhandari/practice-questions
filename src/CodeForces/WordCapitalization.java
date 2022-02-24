package CodeForces;

import java.util.Scanner;
public class WordCapitalization {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s = input.next();
        String[] s1 = s.split("");
        s1[0] = s1[0].toUpperCase();
        for(int i=0;i<s1.length;i++){
            System.out.print(s1[i]);
        }
    }
}
