import java.util.*;
import java.io.*;
public class stack_9012 {
    public static void main(String args[]) throws IOException{
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N =Integer.parseInt(br.readLine());
        
        for(int i=0;i<N;i++){
            String str = br.readLine();
            Stack <Character> ps = new Stack<Character>(); 

            for(int j=0;j<str.length();j++){
                if(!ps.isEmpty()&&ps.peek()=='('&&str.charAt(j)==')'){
                    ps.pop();
                }
                else{
                    ps.add(str.charAt(j));
                    }
                // System.out.println(ps);

                }
                if(ps.isEmpty()){
                    String yes="YES";
                    bw.write(yes);
                    bw.newLine();

                }
                else{
                    String no="NO";

                    bw.write(no);
                    bw.newLine();


                }
                
            }
            bw.flush();
            bw.close();
            br.close();
           
        }
    }

