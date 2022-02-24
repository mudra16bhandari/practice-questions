package CodeForces;

import java.util.Scanner;
public class StonesOnTheTable {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        String stones = input.next();
        int count = 0;

        for(int i=0;i<n-1;i++){
            if(stones.charAt(i) == stones.charAt(i+1)){
                count++;
            }
        }
        System.out.print(count);
    }
}
