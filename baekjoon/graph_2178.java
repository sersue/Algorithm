import java.util.*;

public class graph_2178 {
    
    static int [][] maze;
    static boolean [][] visited;

    static int N,M;

    static int [] dx = {-1,0,1,0};
    static int [] dy = {0,-1,0,1};
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        sc.nextLine();
        maze = new int[N][M];
        visited = new boolean[N][M];

        for(int i=0;i<N;i++){
            String str = sc.nextLine();
            for(int j=0;j<M;j++){
                maze[i][j]=str.charAt(j)-'0';
                visited[i][j]=false;
            }
        }
        visited[0][0]=true;
        BFS(0,0);
        System.out.println(maze[N-1][M-1]);

        // for(int i=0;i<N;i++){
        //     for(int j=0;j<M;j++){
        //         System.out.print(maze[i][j]);

        //     }
        //     System.out.println();
        // }
   

    }

    public static void BFS(int x, int y){
        Queue<Dot> queue = new LinkedList<Dot>();
        queue.add(new Dot(x,y));

        while(!queue.isEmpty()){

            Dot d = queue.poll();
            for(int i=0;i<4;i++){

                int nextX = d.x+dx[i];
                int nextY = d.y+dy[i];
                // System.out.println(nextX);
                // System.out.println(nextY);

                if(nextX<0||nextY<0||nextX>=N||nextY>=M){
                    continue;
                }
                if(visited[nextX][nextY] || maze[nextX][nextY]==0){
                    continue;
                }
               

                queue.add(new Dot(nextX, nextY));
                maze[nextX][nextY] = maze[d.x][d.y]+1;
                // System.out.println("hi"+maze[nextX][nextY]);

                visited[nextX][nextY]=true;
            }
        }
    }
  
    
        
}
  
class Dot{

    int x;
    int y;

    Dot(int x, int y){
        this.x = x;
        this.y = y;
    }
    
}


