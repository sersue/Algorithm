import java.io.*;
import java.util.*;
public class DP_9095 {
    public static void main(String[] args) throws IOException{
        int [] number  = new int [11];
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        number[1]=1;
        number[2]=2;
        number[3]=4;

        int N = sc.nextInt();

        for(int i=0;i<N;i++){
            int a = sc.nextInt();
            for(int j=4;j<11;j++){
                number[j]=number[j-1]+number[j-2]+number[j-3];
            }
            
            System.out.println(number[a]);
        }


    }
    // public static int DP(int n){

    //     return 
    // }
    // bw.flush();
    // bw.close();
}
