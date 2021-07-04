import java.io.*;
import java.util.*;

public class stack_17299 {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //ㅂㅐ열 개수
        int n = Integer.parseInt(br.readLine());

       
        String [] str = br.readLine().split(" ");
        int arr [] = new int[n];
        int result [] = new int[n];
        int freq[] = new int[1000001];

        //frequency 배열 채우는 법 
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(str[i]);
            freq[arr[i]] += 1;
        }
        
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(0);
        for(int i=1;i<n;i++){
            if(stack.isEmpty()){
                stack.push(i);
            }
            while(!stack.isEmpty()&&freq[arr[stack.peek()]]<freq[arr[i]]){
                result[stack.pop()] = arr[i];
            }
            stack.push(i);

        }
        while(!stack.isEmpty()){
            result[stack.pop()]=-1;
        }

        for(int i=0;i<n;i++){
            bw.write(result[i]+" ");
        }
        
        bw.flush();
        bw.close();
        br.close();
        

    }
    
}
