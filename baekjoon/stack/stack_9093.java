import java.io.*;
import java.util.*;

public class stack_9093 {

    

    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());

        while( n-- > 0){
            String str = br.readLine() + '\n';
            Stack<Character> stack = new Stack<Character>();

            for(char ch : str.toCharArray()){
                if(ch==' ' || ch=='\n'){
                    while(!stack.isEmpty()){
                        bw.write(stack.pop());
                    }
                    bw.write(' ');
                    }
                else{
                    stack.push(ch);
                }
            }

            bw.write('\n');
        }
        bw.flush();
        bw.close();
        br.close();

    }
        
    }
    

