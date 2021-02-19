import java.io.*;
import java.util.*;

public class stack_1406 {
    public static Scanner sc = new Scanner(System.in);
    public static String str;
    public static void main(String[] args) throws IOException{
        //받을 문자열
        str = sc.nextLine();
        //연산 수행 수
        int n = sc.nextInt();


        reslove(n);
    }

    private static void reslove(int n) {
        Stack<String> left = new Stack<>();
        Stack<String> right = new Stack<>();
        for(String s : str.toCharArray()){
            left.push(s);
        }
        while(n-- >0){
            String so = sc.nextLine();
            //커서를 왼쪽으로 한칸 옮김
            if(so =="L"){

            }
            else if(so=="P"){

            }
            else if (so =="B"){

            }
            else if( so=="D"){

            }
        }

    }
    
}
