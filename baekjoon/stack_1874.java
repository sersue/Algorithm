import java.util.*;
import java.io.*;
public class stack_1874 {
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //출력초과 : 버퍼가 일정량 이상 차면 비정기적으로 flush가 되는탓 -> StringBuilder 사용
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N =Integer.parseInt(br.readLine());
        int [] array = new int[N];
        Stack <Integer>stack = new Stack<Integer>();
        int j=0;
        
     
            for(int i=0;i<N;i++){
                array[i] = Integer.parseInt(br.readLine());
            }
            
            
            for(int i=0;i<N;i++){
               stack.push(i+1);
               sb.append("+\n");
               

                while(!stack.isEmpty()){
                    if(stack.peek()==array[j]){
                        j++;
                        stack.pop();//12
                        sb.append("-\n");

                    }
                    else if(stack.peek()!=array[j]){
                        break;
                    }
                }    
            
        }
                if(stack.isEmpty()){
                    System.out.println(sb.toString());
                }
                else{
                    System.out.println("NO");
                  
                }
              
                br.close();

    }
}
