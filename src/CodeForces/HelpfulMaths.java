package CodeForces;

import java.util.Arrays;
import java.util.Scanner;
public class HelpfulMaths {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s = input.next();
        String[] s2 = s.split("[+]");
        int[] ar = new int[s2.length];
        for(int i=0;i<s2.length;i++){
            ar[i] = Integer.parseInt(s2[i]);
        }
        Arrays.sort(ar);
        for(int i=0;i<s2.length;i++){
            if(i==0){
                System.out.print(ar[i]);
            }
            else{
                System.out.print("+" +ar[i]);
            }
        }
    }
}
