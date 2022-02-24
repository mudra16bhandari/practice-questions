package CodeForces;

import java.util.Scanner;
public class PetyaAndStrings{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String s1 = input.next();
        String s2 = input.next();
        int res = s1.compareToIgnoreCase(s2);
        if(res>0){
            res = 1;
        }
        if(res<0){
            res = -1;
        }
        System.out.println(res);
    }
}