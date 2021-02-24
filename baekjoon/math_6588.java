import java.util.*;
public class math_6588 {
    //골드바흐의 추측 ()
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean [] check = new boolean[1000001];
        // int [] prime = new int [1000001];
        ArrayList <Integer>prime = new ArrayList<>();

        check[0]=check[1]=true;
        for(int i=2;i<=1000000;i++){
            if(check[i]==true){
                continue;
            }
            
            prime.add(i);
            for(int j=i+i;j<=1000000;j+=i){
                check[j]=true;
            }
            
            
        }
        //input 개수가 지정되지 않은 문제 
        while(true){
            int n = sc.nextInt(); //8
            if (n==0){
                break;
            }
            for(int i=1;i<prime.size();i++){ //3,5,7
                int a = prime.get(i);

                //n-a가 가장 큰 값이어야 하므로 n-a 값 확인 , a는 가장 작은 값부터 확인 
                if(check[n-a]==false){ //8-3 = 5 
                    System.out.println(n +" = " +a+" + "+(n-a));
                    break;
                }
            }

        }
    }
    
}
