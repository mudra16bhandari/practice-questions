package CodeForces;

import java.util.ArrayList;
import java.util.Scanner;
public class BoyOrGirl {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s = input.next();
        char[] ch = s.toCharArray();
        int count=0;
        ArrayList<Character> ar = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(!ar.contains(ch[i])) {
                ar.add(ch[i]);
                count++;
            }
        }
        if(count%2==0){
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }
    }
}
