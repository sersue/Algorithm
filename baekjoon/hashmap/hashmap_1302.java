import java.util.*;

public class hashmap_1302 {
    public static void main(String[]args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
       
        HashMap<String,Integer> map = new HashMap<String,Integer>(N);
        sc.nextLine();
      
        //{문=1,김=4}
        for(int i=0;i<N;i++){
            String bookName = sc.nextLine();
            if(map.containsKey(bookName)){
                map.replace(bookName,map.get(bookName)+1);
            }
            else{
                map.put(bookName,1);
            }
        }
        //max = 4
        int max = 0;
        for(String a : map.keySet()){
            max = Math.max(max,map.get(a));
        }
        //[문,김]
        ArrayList<String> al = new ArrayList<String>(map.keySet());
        //[김,문]
        Collections.sort(al);

        for(String a : al){
           if(map.get(a)==max){
                System.out.println(a);
           }
        
       }
        
        

    }
}
