import java.io.*;
import java.util.*;


public class stack_17298 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int [] arr = new int [a];
        int [] result = new int [a];
        Stack<Integer> stack = new Stack<Integer>();
        String str [] = br.readLine().split(" ");
        //입력
        for(int i=0;i<a;i++){
            
            arr[i] = Integer.parseInt(str[i]);
        }

        //alg
        stack.push(0);
        for(int i=1;i<a;i++){
            if(stack.isEmpty()){
                stack.push(i);
            }
            while(!stack.isEmpty() && arr[stack.peek()] < arr[i]){
                result[stack.pop()]=arr[i];
                // System.out.println("i"+i);

                // System.out.println(arr[i]);

            }
            
            stack.push(i);

            

        }
        while(!stack.isEmpty()){
            result[stack.pop()]=-1;
        }
       
        //답 출력 
        for(int i=0;i<a;i++){    
            bw.write(result[i] +" ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
    
}

 //for문 두번 -> 시간 초과 stack 이용 
        // for(int i=0;i<a;i++){
        //     Stack<Integer> stack = new Stack<Integer>();
        //     stack.push(arr[i]);

        //     for(int j=i;j<a;j++){
            //     stack.push(i)
        //         if(j<a-1){
        //             if(stack.peek()<arr[j+1]){
        //                 stack.pop();
        //                 result[i] = arr[j+1];
        //                 break;
        //             }
        //             else{
        //                 if(j==a-1){
        //                     result[i]=-1;
        //                 }
        //             }
        //         }
                
                
        //     }
        //     if(i==a-1){
        //         result[i]=-1;
        //     }
            

        // }
