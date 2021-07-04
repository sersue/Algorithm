import java.io.*;
import java.util.*;

public class stack_9012_codeplus {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        while(n -- >0){
            String str = br.readLine();
            Stack<Character> stack = new Stack<Character>();

            for(char ch : str.toCharArray()){
                if(!stack.isEmpty()){
                    if( stack.peek()=='(' && ch == ')'){ //stack.peek()='(' -> 가장 가까운 (을 사용함을 이용 
                        stack.pop();
                        
                    }
                    else{
                        stack.push(ch);
                    
                    }
                }
                
                else{
                    stack.push(ch);
                
                }
                
                
            }
            
            
            

            if(stack.isEmpty()){
                bw.write("YES"+'\n');
            }
            else{
                bw.write("NO"+'\n');
            }
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
