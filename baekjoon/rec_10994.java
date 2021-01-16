import java.util.Scanner;
public class rec_10994 {

    public static String [][] map;
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        map = new String[4*(N-1)+1][4*(N-1)+1];

        rec(N,0,0);

        for(int i=0;i<4*(N-1)+1;i++){
            for(int j=0;j<4*(N-1)+1;j++){
                System.out.print(map[i][j]);

            }
            System.out.println();
        }

    }

    public static void rec(int N,int x,int y){

        if(N==1){
            map[x][y]="*";
            return;
        }
        else{
            for(int i=x;i<x+4*(N-1)+1;i++){
                for(int j=y;j<y+4*(N-1)+1;j++){
                    if(i==x||i==x+4*(N-1)){
                        map[i][j]="*";
                    }
                    
                    else{
                        if(j==y||j==y+4*(N-1)){
                            map[i][j]="*";
                        }
                        else{
                            map[i][j]=" ";
                        }
                    }
                    rec(N-1,x+2,y+2);
                }   
        }
            
                 
                
            
            
        
    }
        
}
}