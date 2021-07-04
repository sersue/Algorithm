import java.util.*;


public class DP_1932 {
    static int [][] arr;
    static Integer [][] dp;
    
    
    static int N;
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N+1][N+1];
        dp = new Integer [N+1][N+1];
       
        
        for(int i=0;i<N;i++){
            for(int j=0;j<=i;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        
        // 입력 끝
        for(int i=N-1;i<N;i++){
            for(int j=0;j<=i;j++){
                dp[i][j]=arr[i][j];
            }
        }

        System.out.println(find(0,0));
        
        
    }
    public static int find(int x, int y){
        if(x ==N-1){//4
            return dp[x][y];
        }
        if(dp[x][y]== null){
            // System.out.println(Math.max(find(x+1,y), find(x+1,y+1)));
            dp[x][y]= Math.max(find(x+1,y), find(x+1,y+1))+arr[x][y];

            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    System.out.print(dp[i][j]);
                }
                System.out.println();
            }
            
        }
        return dp[x][y];
    }
    
}
