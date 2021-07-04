import java.io.BufferedReader;
import java.io.*;
import java.util.*;
public class graph_10159 {

    static int nV;
    static int nE;

    static boolean arr[][] = new boolean[101][101];
    static boolean reverse[][] = new boolean[101][101];
    public static void main(String args[]) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);

        nV = Integer.parseInt(br.readLine()); //6
        nE = Integer.parseInt(br.readLine()); //5번

             
        //제네릭 arraylist안에 arraylist
        for(int i=1;i<=nE;i++){
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b]=true;
            reverse[b][a]=true;
        }

        
        for(int k=1;k<=nV;k++){
            for(int i=1;i<=nV;i++){
                for(int j=1;j<=nV;j++){
                    if(arr[i][k]&&arr[k][j]){
                        arr[i][j]=true;
                    }
                    if(reverse[i][k]&&reverse[k][j]){
                        reverse[i][j]=true;
                    }
                    
                    

                }
            }
        }

        for (int i = 1; i <= nV; i++) {
            for (int j = 1; j <= nV; j++) {
                arr[i][j] = arr[i][j]|reverse[i][j];
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=nV;i++){
            int count =0;
            for(int j=1;j<=nV;j++){
                if(i==j){
                    continue;
                }
                if(!arr[i][j])//false
                {
                    count++;
                }
            }
            sb.append(count +"\n");

        }
        bw.write(sb.toString());
        

        bw.flush();
        bw.close();
        br.close();
    }
    }
