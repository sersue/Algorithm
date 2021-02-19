import java.io.*;
import java.util.*;

public class stack_1406 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //받을 문자열
        String str = br.readLine();
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();
        //문자열 쪼개기
        for(int i=0;i<str.length();i++){
            left.push(str.charAt(i));
        }
        //연산 수행 수
        int n = Integer.parseInt(br.readLine());
       
        
        // System.out.println(n);
        while(n-- >0){
            //쪼개서 저장
            String [] so = br.readLine().split(" ");
            char what = so[0].charAt(0);
            //커서를 왼쪽으로 한칸 옮김
            if(what =='L'){
                if(!left.isEmpty()){
                    right.push(left.pop());
                }
            }
            else if(what=='P'){
                char next = so[1].charAt(0);
                left.push(next);

            }
            else if (what =='B'){
                if(!left.isEmpty()){
                    left.pop();
                }
            }
            else if( what=='D'){
                if(!right.isEmpty()){
                    left.push(right.pop());
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!left.isEmpty()){
            right.push(left.pop());
        }
        while(!right.isEmpty()){
            sb.append(right.pop());
        }

        System.out.println(sb);

    
    
}
}