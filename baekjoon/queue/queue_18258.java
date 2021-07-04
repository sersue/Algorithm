import java.util.*;
import java.io.*;
public class queue_18258 {
    public static void main(String[]args) throws IOException{
        //시간초과
        // Scanner sc = new Scanner(System.in);
        //bufferreader,bufferwriter,StringTokenizer 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Queue <Integer> number = new LinkedList<Integer>();

        String str ="";
        String command ="";
        int last =0;

        for(int i=0;i<N;i++){
            str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            command = st.nextToken();

            
            switch(command){
                case "push": 
                    if(st.hasMoreTokens()){
                        int a = Integer.parseInt(st.nextToken());
                        number.add(a);
                        last = a;
                        break;

                    }

                case "pop":
                    if(!number.isEmpty()){
                        int pop = number.peek();
                        bw.write(pop+"\n");
                        number.poll();
                    }
                    else{
                        bw.write(-1+"\n");

                    }
                    break;

                    
                case "size":
                    bw.write(number.size()+"\n");     
                    break;
               

                case "empty":
                    if(number.isEmpty()){
                        bw.write(1+"\n");                    
                    }
                    else{
                        bw.write(0+"\n");

                    }
                    break;

                case "front": 
                    if(!number.isEmpty()){
                        bw.write(number.peek()+"\n");

                    }
                    else{
                        bw.write(-1+"\n");

                    }
                    break;

                case "back":
                    if(!number.isEmpty()){
                        bw.write(last+"\n");

                        //arraylist 메모리초과
                        // int k = number.size();
                        // for(int j=1;j<=k;j++){
                        //     int n = number.poll();
                        //     list.add(n);
                        //     number.add(n);
                        // }
                        // System.out.println(list.get(number.size()-1));
                      
                    }
                    else{
                        bw.write(-1+"\n");
                    }
                    break;


                default:
                    break;
                
                    

           }
           
        }
        bw.flush();
        bw.close();
        br.close();

    }    
}
