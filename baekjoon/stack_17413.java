import java.util.*;
import java.io.*;
public class stack_17413 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        
        Stack <Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        Boolean is = false;
        for( char ch : str.toCharArray()){
            if(ch=='<'){
                print(sb,stack);
                sb.append(ch);
                is = true;
            }
            else if(ch=='>'){
                sb.append(ch);
                is= false;
            }
            //< >사이에 있는 문자열  
            else if(is){
                sb.append(ch);
            }
            else{
                if(ch == ' '){
                    print(sb,stack);
                    sb.append(ch);

                }
                else{
                    stack.push(ch);
                }

                }
            }
            print(sb,stack); //마지막 stack에 남아있는 것을 위해 
            System.out.println(sb);

        }


    public static void print(StringBuilder sb, Stack<Character> stack){

        while(!stack.isEmpty()){
            sb.append(stack.pop());

        }
    }
}

 // for(int i=0;i<str1.length;i++){
        //     for(int j=0;j<str1[i].length();j++){
        //         if(str1[i].charAt(j)=='<'){
        //             while(str1[i].charAt(j)=='>'){
        //                 sb.append(str1[i].charAt(j));
        //                 j++;
        //                 System.out.println(j);
        //             }
        //         }
        //         else{
        //             stack.push(str1[i].charAt(j));
                    
        //         }

        //         //  System.out.println(stack);


        //     }
        //     while(!stack.isEmpty()){
        //         sb.append(stack.pop());

        //     }
        //         // System.out.println(stack.size());
    
            
        //     sb.append(" ");
        // }
        

    

