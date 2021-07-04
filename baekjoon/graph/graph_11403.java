import java.io.*;
import java.util.*;

public class graph_11403 {
    public static void main(String []args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        String arr [][] = new String[101][101];
        boolean conn [][] = new boolean[101][101];
        boolean reverse [][] = new boolean[101][101];

        int n = Integer.parseInt(br.readLine());
        
        for(int i=1;i<=n;i++){
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            
            for(int k=1;k<=n;k++){
                arr[i][k] = st.nextToken();
                }
                
            
        }
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         System.out.print(arr[i][j]);

        //     }
        // }

        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(arr[i][j].equals("1")){
                    conn[i][j]=true;
                    // reverse[j][i]=true;
                }
                
                

            }
        }
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         System.out.println(conn[i][j]);

        //     }
        // }
        
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         System.out.println(reverse[i][j]);

        //     }
        //     System.out.println();

        // }

        for(int k=1;k<=n;k++){
            for (int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if(conn[i][k]&&conn[k][j]){
                        conn[i][j]=true;
                    }
                    // if(reverse[i][k]&&reverse[k][j]){
                    //     reverse[i][j]=true;
                    // }
                }
            }
        }

         

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         conn[i][j] = conn[i][j]|reverse[i][j];

        //     }
        // }
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(conn[i][j]==true){
                    sb.append(1+" ");
                }
                else{
                    sb.append(0+" ");

                }

            }
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}
