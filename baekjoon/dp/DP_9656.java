import java.util.*;

public class DP_9656 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i=0;

        dp(N,i);
    }

    private static void dp(int n, int i) {
        if(n==1 && i==0){
            System.out.println("CY") ;
            return ;
        }
        if(n==1&& i==1){
            System.out.println("SK") ;
            return ;
        }

        if(i==0){
            i=1;
            // return "";
        }else {
            i=0;
            // return "";
        }

        if(n<4){
            dp(n-1,i);

        }
        else{
            dp(n-3,i);
    

        }

    }
}
    
    

