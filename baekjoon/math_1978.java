import java.util.*;
import java.io.*;

public class math_1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result =0;
        while(n-- >0){
            if(pn(sc.nextInt())){
                result ++;
            }
            
        }        
        System.out.println(result);

       
    }

    public static boolean pn(int n) {
        if(n<=1){
            return false;
        }
        else if(n==2){
            return true;
        }
        
        //시간 복잡도 O(루트n)으로 가장 효율적인 방법 
        for(int j=2; j*j<=n;j++){
            if(n%j == 0){
                return false;
            }
            }
        
        return true;
        
    }
        
    
    
}
