package CodeForces;

import java.util.Scanner;
public class TheatreSquare{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        long n = input.nextInt();
        long m = input.nextInt();
        long a = input.nextInt();
        long result;
        if(n%a==0){
            result = n/a;
        }
        else{
            result = n/a + 1;
        }
        if(m%a==0){
            result = result*(m/a);
        }
        else{
            result = result*(m/a +1);
        }
        System.out.println(result);
    }

}