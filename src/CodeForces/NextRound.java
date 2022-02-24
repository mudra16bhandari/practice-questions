package CodeForces;

import java.util.Scanner;
public class NextRound{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int count=0;
        int n = input.nextInt();
        int k = input.nextInt();
        int[] score = new int[n];
        for(int i=0;i<n;i++){
            score[i] = input.nextInt();
        }
        for(int i=0;i<n;i++){
            if(score[i]>0 && score[i]>=score[k-1]){
                count++;
            }
        }
        System.out.println(count);
    }
}
