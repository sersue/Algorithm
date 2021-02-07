import java.io.BufferedReader;
import java.io.*;
import java.util.*;

public class graph_2468 {
    static Queue<DOOT> queue = new LinkedList<>();
    static int [] dx = {-1,0,1,0};
    static int [] dy = {0,-1,0,1};
    static int N;
    static int [][]map,flood;
    static int safebound;
    static int max1;
    public static void main(String args[]) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        N = Integer.parseInt(br.readLine());

        map = new int[N][N];
        flood = new int[N][N];
        int max = 0;

        for(int i=0;i<N;i++){
            String str = br.readLine();
            for(int j=0;j<N;j++){
                StringTokenizer st = new StringTokenizer(str);
                int input =Integer.parseInt(st.nextToken());
                map[i][j]=input;  
                if(max<input){
                    max =input;
                    
                }      
                

            }

        }
        System.out.println("max"+max);

        for(int i=0;i<max;i++){
            int result= BFS(i);
            if(max1<result){
                max1=result;
                System.out.println(result);

            }


        }
        // System.out.println(max1);

    }
    public static int BFS(int a){

        // queue.add(new DOOT(0,0));

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(map[i][j]<=a){
                    flood[i][j]=1;
                }
                else{
                    flood[i][j]=0;
                }
                
            }
        }
        while(!queue.isEmpty()){
            DOOT dt =queue.poll();
    
                for(int k=0;k<N;k++){
                    for(int l=0;l<N;l++){
                        if(flood[k][l]==0){
                            for(int i=0;i<4;i++){
                                int nextX = dt.x + dx[i];
                                int nextY = dt.y + dy[i];
                            if(flood[nextX][nextY]==0&&nextX>=0&&nextY>=0&&nextX<N&&nextY<N){
                                queue.add(new DOOT(nextX,nextY));
                                safebound++;
                            }
                        }
                    }
                }
            }
                
            }
        System.out.println(safebound);
        return safebound;
    }
    
}
class DOOT{
    int x;
    int y;
    public DOOT(int x, int y){
        this.x= x;
        this.y=y;
    }
}

