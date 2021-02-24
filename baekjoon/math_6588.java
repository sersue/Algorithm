import java.util.*;
public class math_6588 {
    //골드바흐의 추측 ()
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean [] check = new boolean[1000001];
        int [] prime = new int [1000001];
        int n = sc.nextInt();
        int pn = 0;

        check[0]=check[1]=true;

        for(int i=2;i<=n;i++){
            if(check[i]==false){
                prime[pn++]=i;
            }
            for(int j=i;j<i+i;j+=i){
                check[j]=true;
            }
        }

        while(true){
            

        }
    }
    
}
