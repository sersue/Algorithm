
import java.io.*;
import java.util.*;

public class stack_10799 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = br.readLine();
        Stack<Integer>stack = new Stack<Integer>();
        int piece = 0;

        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c == '('){
                stack.push(i);
            }
            else{
                if(stack.peek()+1==i){
                    stack.pop();
                    piece = piece+stack.size(); 

                }
                else{
                    stack.pop();
                    piece++;
                }
            }
        }
        System.out.println(piece);


        //스택의 순서값이 필요 
        // for(char ch : str.toCharArray()){
        //     if(ch=='('){
        //         stack.push(ch);

        //     }

        //     else{
        //         stack.pop();
        //         if(stack.isEmpty()){
        //             piece = piece+0;
        //         }
        //         else{
                    
        //         }
        //     }
        // }
        
    }

    
}

