import java.util.Scanner;

public class rec_11729 {

    
    public static int [][] paper;

    public static int white;//하얀 종이 개수
    public static int blue;// 파란 종이 개수

    public static void calc(int N,int x, int y){
    
        if(isEqual(N, x, y)){
            if(paper[x][y]==1)blue++;
            else white++;
            return;
        }

        calc(N/2,x,y);
        calc(N/2,x+N/2,y);
        calc(N/2,x,y+N/2);
        calc(N/2,x+N/2,y+N/2);

        

        }

    public static boolean isEqual(int N, int x, int y){

        int equal=paper[x][y];

        for(int i=x;i<x+N;i++){
            for(int j=y;j<y+N;j++){
                if(equal!=paper[i][j]) return false;   
            }
        }
        return true; 
    } 
  
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 전체 종이의 한변의 길이
        paper = new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                paper[i][j] = sc.nextInt();
            }
        }
        calc(N,0,0);
        System.out.println(white);
        System.out.println(blue);


    }
}