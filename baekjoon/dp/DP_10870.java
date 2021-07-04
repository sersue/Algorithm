import java.util.*;
public class DP_10870 {
    static int [] arr;
    static int N;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        arr = new int [21];
        N = sc.nextInt();
        arr[0]=0;
        arr[1]=1;
        arr[2]=1;
        DP(N);
    }
    public static void DP(int n){
        for(int i=3;i<=n;i++){
            arr[i]= arr[i-1]+arr[i-2];
        }
        System.out.println(arr[n]);
    }
    
}
