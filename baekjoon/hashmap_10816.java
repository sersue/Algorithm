import java.io.*;
import java.util.*;

public class hashmap_10816 {
    public static void main(String[] args) throws IOException{

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        HashMap <Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i=0;i<N;i++){
            int a = sc.nextInt();
            if(map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }
            else{
                map.put(a,1);
            }
        }
        // System.out.println(map);

        int M = sc.nextInt();
        for(int i=0;i<M;i++){
            int b = sc.nextInt();
            if(map.containsKey(b)){
                bw.write(map.get(b)+" ");
                // System.out.println(map.get(b));
                // bw.write(" ");
            }
            else{
                bw.write(0+" ");
              
            }


        }

        bw.flush();
      
        bw.close();


    }   
}
