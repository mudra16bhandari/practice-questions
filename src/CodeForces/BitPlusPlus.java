package CodeForces;

import java.util.Scanner;
public class BitPlusPlus {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] s = new String[n];
        int x = 0;
        for(int i=0;i<n;i++) {
            s[i] = input.next();
            if(s[i].contains("+")) {
                x++;
            }
            else {
                x--;
            }
        }
        System.out.println(x);
    }

}
