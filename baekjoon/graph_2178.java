import java.util.*;

public class graph_2178 {
    
    static int [][] maze;
    static boolean [][] visited;

    static int N,M;
    static int result =1;
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
     
        // DFS(0,0,result);
        // System.out.println(result);

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

    // public static void DFS(int x,int y,int result){
    //     visited[x][y]=true;

    //     //break point
    //     if(x==N&&y==M){
    //         return;
    //     }
    //     //위
    //     if(x>0&&maze[x-1][y]==1&&visited[x-1][y]==false){
    //         DFS(x-1,y,result+1);
    //     }
    //     //왼쪽
    //     if(y>0&&maze[x][y-1]==1&&visited[x][y-1]==false){
    //         DFS(x,y-1,result+1);
    //     }
    //     System.out.println("x"+x);
    //     System.out.println("y"+y);

    //     //오른쪽
    //     if(y<M-1&&maze[x][y+1]==1&&visited[x][y+1]==false){
    //         DFS(x,y+1,result+1);
    //     }
    //     //아래
    //     if(x<N-1&&maze[x+1][y]==1&&visited[x+1][y]==false){
    //         DFS(x+1,y,result+1);
    //     }
    // }
  
    
        
}
  
class Dot{

    int x;
    int y;

    Dot(int x, int y){
        this.x = x;
        this.y = y;
    }
    
}


