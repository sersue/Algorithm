import java.util.*;

public class queue_1158 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        Queue <Integer> people = new LinkedList<Integer>();
        StringBuilder result1 = new StringBuilder("<");

        for(int i=1;i<=N;i++)//1234567
        {
            people.add(i);


        }
        while(!people.isEmpty()){
            for(int i=1;i<k;i++){
                people.add(people.peek());
                people.poll();
            }
            result1.append(people.peek());
            result1.append(", ");
            people.poll();
            
        }

        // while(!people.isEmpty()){
        //     int n= people.peek();
        //     if(people.size()==1){
        //         result1.append(n);

        //         people.poll();
             
        //     }
        //     else{
        //         result1.append(n);
        //         result1.append(",");

        //         people.poll();
        //     }
        // }
        System.out.println(result1.toString().substring(0,result1.length()-2)+">");
       
    }    
}

