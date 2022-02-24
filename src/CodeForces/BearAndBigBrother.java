package CodeForces;

import java.util.Scanner;
public class BearAndBigBrother {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int years = 0;

        while(a<=b){
            a = 3*a;
            b = 2*b;
            years++;
        }

        System.out.print(years);
    }
}
