import java.io.BufferedReader;
import java.io.*;
import java.util.*;
public class graph_1260 {

    static BufferedReader br;
    static BufferedWriter bw ;
    static int [][] ab;
    static boolean visited [];
    static int N ; //정점의 개수
    static int M  ;// 간선의 개수 
    static int start ;//시작할 정점 
    static StringTokenizer st;

    //DFS Stack
    static Stack <Integer>stack = new Stack<Integer>();
    static Queue <Integer> queue = new LinkedList<Integer>();
    public static void main(String args[]) throws IOException{
        

        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        st = new StringTokenizer(str);

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        start= Integer.parseInt(st.nextToken());
        // ab=new int [101][101];
        
        ab = new int[N+1][N+1];

        for(int i=1;i<=M;i++){
            String str1 = br.readLine();
            st = new StringTokenizer(str1);
            int a = Integer.parseInt(st.nextToken());
            int b= Integer.parseInt(st.nextToken());;
            ab[a][b] =1;
            ab[b][a]=1;
        }

        visited = new boolean[N+1];
        DFS(start);
        visited = new boolean[N+1];
        System.out.print("\n"); //124

        BFS(start);

        // bw.flush();
        bw.close();
        br.close();

    }
    static void DFS(int b) throws IOException{

        visited[b]=true; //124
        System.out.print(b +" "); //124

        if(b == ab.length){
            return;
        }
            for(int i=1;i<=N;i++){
                if(ab[b][i]==1 & visited[i]==false){
                    DFS(i);
                }
                
            }
    }
    static void BFS(int start){        
        visited[start]=true;
        queue.add(start);
        System.out.print(start+" ");

        while(!queue.isEmpty()){

            int temp = queue.peek();
            queue.poll();
            for(int i=1;i<ab.length;i++){
                if(ab[temp][i]==1&visited[i]==false){
                    queue.add(i);
                    visited[i]=true;
                    System.out.print(i+" ");
                }
            }
        }
        
        
    }

    
}
