import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class queue_2161 {


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Queue <Integer> number= new LinkedList<>();

        for(int i=1;i<=N;i++){
            number.offer(i);//1,2,3,4
        }
      

       
        while(!number.isEmpty()){
            int a,b;

            b = number.poll();

            System.out.print(b+" ");

            if(number.isEmpty()){
                break;
            }

            a = number.poll();
            number.add(a);
            
           

        }

    }
    

    
}
/* 풀이
    큐를 이용해 해결했다
    가장 위에 값 제거 -poll
    그 다음으로 위에 값 제거후 삽입 -offer
    while (isnotEmpty)
        if(Empty)
            break;
 */