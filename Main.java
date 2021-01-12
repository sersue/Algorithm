import java.util.Scanner;

public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] code = new int[19][19];
        //십자 뒤집기 전 바둑돌
        for(int i=0;i<19;i++){
            for(int j=0;j<19;j++){
                code[i][j]=sc.nextInt();
            }
        }
        
        int n = sc.nextInt();
        int x,y=0;
        //십자 뒤집기 할 바둑돌 좌표
        for(int i=0;i<n;i++){
            x = sc.nextInt();
            y = sc.nextInt();
            for(int k=0;k<19;k++){
                if(code[x][k]==0){
                    code[x][k]=1;
                }
                else {
                    code[x][k]=0;
                    }
                }
            for(int k=0;k<19;k++){
                if(code[k][y]==0){
                    code[k][y]=1;
                }
                else{
                    code[k][y]=0;
                    }
                }
            

        }

        for(int i=0;i<19;i++){
            for(int j=0;j<19;j++){
                System.out.printf("%d ",code[i][j]);
            }
            System.out.print("\n");

        }
        
        
        
        
        
        // for(int m=0;m<19;m++){
        //     for(n=0;n<19;n++){
        //         code[m][n] =0;
        //         if(m==re1.get(m)&&n==re1.get(n)){
        //             code[m][n]=1;
        //         }

        //         System.out.println(code[m][n]);
        //     }
        // }
        
    }
}