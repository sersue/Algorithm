import java.util.*;

public class queue_15828 {
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int Router_size = sc.nextInt(); //5
            Queue <Integer> queue = new LinkedList<Integer>();
            int input =0;

            while(input!=-1){
                input =sc.nextInt();
                if(Router_size>queue.size()){
                    if(input>0){
                        queue.add(input);
    
                    }
                    else if(input ==-1){
                        break;
                    }
                    else{ //0
                        queue.poll();
    
                    }
                }else{
                    if(input==0){
                        queue.poll();
                    }
                }
                
                
                
            }

            if(!queue.isEmpty()){
                while(!queue.isEmpty()){
                    int result = queue.poll();
                    System.out.print(result+" ");
                    if(queue.isEmpty()) {
                        break;
                    }
                }
            }
            else{
                System.out.print("empty");

            }
           

           
            

        }
}
