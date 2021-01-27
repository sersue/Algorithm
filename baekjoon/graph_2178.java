import java.io.BufferedReader;
import java.io.*;
import java.util.*;

public class graph_2178 {
    static BufferedReader br;
    static BufferedWriter bw ;
    static char [][] maze;
    static boolean [][] visited;
    static int N,M;
    static int path;
    public static void main(String args[]) throws IOException{

        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        maze = new char[N][M];
        visited = new boolean[N][M];
    
        for(int i=0;i<N;i++){
            String arrNum = br.readLine();
            for(int j=0;j<M;j++){ 
                maze[i][j]=arrNum.charAt(j);
            }
        }
        Maze(0,0);


    
    }

    static void Maze(int x, int y){

        visited[x][y]=true;  
        if(x == N&y==M){
            return;
        }
        if(){
            for(int i=0;i<=1;i++){
                for(int j=0;j<=1;j++){
                    if(maze[x+i][y+j]==1&visited[x+i][y+j]==false){
                        Maze(x+i,y+i);
                    }
                }
            }
        }
        
    }
}
