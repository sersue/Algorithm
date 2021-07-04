import java.util.*;

public class DP_16194 {
    static int [] arr;
    static int [] memo;
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    arr = new int[N+1];//0,1,2,3,4
    memo = new int [N+1]; //0,1,2,3,4
    for (int i=1;i<=N;i++){
        arr[i]= sc.nextInt(); //1,2,3,4
    }
    DP(N);


}
    public static void DP(int N){
        
        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
                if(memo[i]==0||memo[i]>memo[i-j]+arr[j]){
                    memo[i] = memo[i-j]+arr[j];
                }
            }
            

        }
        System.out.println(memo[N]);
    }
}
