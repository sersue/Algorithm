
import java.io.BufferedReader;
import java.io.*;
import java.util.*;

public class graph_7576 {
    static int [][] box;
    static Queue<DOT>queue = new LinkedList<>();
    static int [] dx = {-1,0,1,0};
    static int [] dy = {0,-1,0,1};
    static int result;
    static int N,M;
    public static void main(String []args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        box = new int [N][M];

        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++){
                int a = Integer.parseInt(st.nextToken());
                box[i][j] = a;

            }
            
        }
        BFS();
        

    }

    public static void BFS(){

        int day=0;

        for(int i=0;i<N;i++){
            for (int j=0;j<M;j++){
                if(box[i][j]==1){
                    queue.add(new DOT(i,j,0));
                    // DOT a = new DOT(i,j,0);
                    // System.out.println(a);
                }
            }
        }
        while(!queue.isEmpty()){
            DOT a = queue.poll();
            day = a.day;

            for(int i=0;i<dx.length;i++){

                int nextX =a.x+dx[i];
                int nextY = a.y+dy[i];
                // if(nextX<0||nextY<0||nextX>=N||nextY>=M){
                //     continue;
                // }
                // if(box[nextX][nextY]==-1){
                //     continue;
                // }
                // if(visited[nextX][nextY]==true){
                //     continue;
                if(0<=nextX && nextX<N && 0<=nextY && nextY<M){
                    if(box[nextX][nextY]==0){
                        box[nextX][nextY]=1;
                        queue.add(new DOT(nextX,nextY,day+1));
                       
                    }
                }

                // for(int k=0;k<N;k++){
                //     for(int l=0;l<M;l++){
                //         System.out.print(box[k][l]);

                //     }
                //     System.out.println();
                // }
                // System.out.println();

                }

               
            }

            if(checkBox()){
                System.out.println(day);
            }
            else
                System.out.println(-1);
            
            

        }

        private static boolean checkBox() {
            for(int i=0;i<N;i++){
                for(int j=0;j<M;j++){
                    if(box[i][j]==0){
                        return false;
                    }
                }
            }
            return true;
        }
    }

class DOT{

    public int x;
    public int y;
    public int day;
    public DOT(int x,int y,int day){
        
        this.x=x;
        this.y=y;
        this.day=day;
    }
}

