import java.io.*;
import java.util.*;

public class DP_1149 {
    final static int red =0;
    final static int green =1;
    final static int blue =2;

    static int[][] map;
    static int[][] dp;
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        map = new int[N][3];
        dp = new int[N][3];

        for(int i=0;i<N;i++){
            map[i][red] = sc.nextInt();
            map[i][green] = sc.nextInt();
            map[i][blue] = sc.nextInt();

        }

        dp[0][red]=map[0][red];
        dp[0][green]=map[0][green];
        dp[0][blue]=map[0][blue];

        System.out.print(Math.min(Paint_cost(N-1,red),Math.min(Paint_cost(N-1,green),Paint_cost(N-1, blue))));
      

}
    public static int Paint_cost(int N, int color){

        if(dp[N][color]==0){

            if(color==red){
                dp[N][red]=Math.min(Paint_cost(N-1,green),Paint_cost(N-1,blue))+map[N][red];
            }
            else if(color ==green){
                dp[N][green]=Math.min(Paint_cost(N-1,red),Paint_cost(N-1,blue))+map[N][green];
            }
            else {
                dp[N][blue]=Math.min(Paint_cost(N-1,red),Paint_cost(N-1,green))+map[N][blue];
            }
        }

        return dp[N][color];
    }
}

