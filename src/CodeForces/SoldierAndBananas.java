package CodeForces;

import java.util.Scanner;
public class SoldierAndBananas {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        int n = input.nextInt();
        int w = input.nextInt();
        int result = (k*w*(w+1))/2 - n;
        if(result<0){
            result = 0;
        }
        System.out.println(result);
    }
}
