import java.io.*;
import java.util.*;
public class graph_2606 {

    static boolean array [][] = new boolean[101][101];
    static boolean reverse [][] = new boolean[101][101];

    static int count;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); //컴퓨터의 수 
        int connect = Integer.parseInt(br.readLine()); // 연결 수 

        for(int i=1;i<=connect;i++){
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            array[a][b] = true;
            array[b][a]=true;

        }

        for(int k=1;k<=N;k++){
            for(int i=1;i<=N;i++){
                for(int j=1;j<=N;j++){
                    if(array[i][k]&array[k][j]){
                        array[i][j]=true;
                    }
                    
                }
            }
        }

        // for(int i=1;i<=N;i++){
        //     for(int j=1;j<=N;j++){
        //         array[i][j]= array[i][j]|reverse[i][j];

        //     }
        // }
            
        
        StringBuilder sb = new StringBuilder();
        for(int i=2;i<=N;i++){
            if(array[1][i]){
                count=count+1;
                // System.out.println(i);

            }
            
        }
        sb.append(count);
       bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
    
}
