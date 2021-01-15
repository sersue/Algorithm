import java.util.Objects;
import java.util.Scanner;

public class rec_11729 {

    public static Scanner sc = new Scanner(System.in);
    public static int N = sc.nextInt(); // 전체 종이의 한변의 길이
   public static int [][] paper = new int[N][N];
    public static int white;//하얀 종이 개수
    public static int blue;// 파란 종이 개수

    public static void calc(int N){

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(Objects.deepEquals(paper, 1.0)){
                    white = white+1;
                    }
                else if(Objects.deepEquals(paper, 0.0)){
                    blue = blue+1;
                    }
                
                else{
                    calc(N/2);
                }

                
            }
        }


 

    }
    public static void main(String[]args){
        
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                paper[i][j] = sc.nextInt();
            }
        }
        calc(N/2);
        System.out.println(white);
        System.out.println(blue);


        

    }
}