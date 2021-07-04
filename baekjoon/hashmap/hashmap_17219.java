import java.io.*;
import java.util.*;

public class hashmap_17219 {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList <String>al = new ArrayList<String>();
        

        String input = br.readLine();
        StringTokenizer st1 = new StringTokenizer(input);
        int N = Integer.parseInt(st1.nextToken());
        int M = Integer.parseInt(st1.nextToken());
        HashMap<String,String> site = new HashMap<String,String>();
        

        for(int i=0;i<N;i++){
            String info = br.readLine();
            StringTokenizer st = new StringTokenizer(info);
            site.put(st.nextToken(),st.nextToken());
        }
       
        for(int i=0;i<M;i++){
            String find = br.readLine();
            if(site.containsKey(find)){
                bw.write(site.get(find));
                bw.write("\n");
                }
        }
       
        
        bw.flush();
        br.close();
        bw.close();
    }
}
