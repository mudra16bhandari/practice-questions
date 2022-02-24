package CodeForces;

import java.util.Scanner;
public class Team{
    static int result=0;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int count = 0;
        int n = input.nextInt();
        int[] arr = new int[3];
        for(int i=0;i<n;i++){
            count = 0;
            for(int j=0;j<3;j++){
                arr[j] = input.nextInt();
                if(arr[j]==1){
                    count++;
                }
            }
            if(count>=2){
                result++;
            }
        }
        System.out.println(result);
    }
}