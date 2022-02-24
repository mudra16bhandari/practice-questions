package CodeForces;

import java.util.Scanner;
public class WayTooLongWords{

    String abb(String str){
        char[] ch = str.toCharArray();
        int count = str.length() - 2;
        return ch[0]+String.valueOf(count)+ch[str.length()-1];
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        WayTooLongWords m = new WayTooLongWords();
        int n = input.nextInt();
        String[] s = new String[n];
        for(int i=0;i<n;i++){
            s[i] = input.next();
        }
        for(int i=0;i<n;i++){
            if(s[i].length()<=10){
                System.out.println(s[i]);
            }
            else{
                System.out.println(m.abb(s[i]));
            }
        }
    }
}