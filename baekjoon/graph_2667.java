import java.util.*;
public class graph_2667 {
    static int N;
    static int [][] town;
    static boolean [][] visited;
    static int [] dx = {-1,0,1,0};
    static int [] dy = {0,-1,0,1};
    static Map<Integer,Integer> result;
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        sc.nextLine();

        town = new int [N][N];
        visited = new boolean [N][N];
        result = new HashMap<Integer,Integer>();

        for(int i=0;i<N;i++){
            String str = sc.nextLine();
            for(int j=0;j<N;j++){
                town[i][j] = str.charAt(j) -'0';
                visited[i][j]=false;
            }
        }

        BFS();
        
        System.out.println(result);
        
    }

    public static void BFS(){

        Queue<dot> queue = new LinkedList<dot>();
        int re=0;
        int value=0;

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){

                // visited[i][j]=true;

                if(town[i][j]==0&&visited[i][j]==true){
                    continue;
                }
                
                queue.add(new dot(i,j));
                while(!queue.isEmpty()){
                    
                    dot d = queue.poll();
                   
                    for(int k=0;k<4;k++){
                        int nextX = d.x+dx[k];
                        int nextY = d.y+dy[k];

                        if(nextX<0||nextY<0||nextX>=N||nextY>=N){
                            continue;
                        }
                        if(visited[nextX][nextY] || town[nextX][nextY]==0){
                            continue;
                        }
                        queue.add(new dot(nextX,nextY));
                        visited[nextX][nextY]=true;
                        value ++;
                        }
                    }
                    result.put(re,value);
                    re++;
                
            }
        }
    }

    
}

class dot{
    int x, y;

    public dot(int x, int y){
        this.x = x;
        this.y = y;
    }
}