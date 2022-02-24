package CodeForces;

import java.util.Scanner;
public class BeautifulMatrix {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int[][] ar = new int[5][5];
        int row=0, col=0;
        int res=0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                ar[i][j] = input.nextInt();
                if(ar[i][j]==1){
                    row = i;
                    col = j;
                }
            }
        }
        if(row>=2){
            if(col>=2){
                res = row-2 + col-2;
            }
            else{
                res = row-2 + 2-col;
            }
        }
        else{
            if(col>=2){
                res = 2-row + col-2;
            }
            else{
                res = 2-row + 2-col;
            }

        }
        System.out.println(res);
    }
}
