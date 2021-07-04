
import java.util.*;

public class stack_10773 {

    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result=0;
        Stack<Integer> money = new Stack<>();

        for(int i=0;i<N;i++){
            int a = sc.nextInt();

            if(a!=0){
                money.push(a);
            }
            else{
                money.pop();
            }
        }
        

        while(!money.isEmpty()){
            for(int i=0;i<money.size()+1;i++){
                result=result+money.pop();
            }
        }
        System.out.println(result);  
            

        

      
    }

}
