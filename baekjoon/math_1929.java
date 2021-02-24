import java.util.*;
public class math_1929 {

    // 소수 문제는 에라토스테네스의 체 이용 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] prime = new int[1000000];
        boolean[] check = new boolean[1000001]; //false로 자동 초기화
        //지워졌으면 true.즉 false값이 소수 

        int pn = 0;
        //0,1
        check[0]=true;
        check[1]=true;
        for(int i=2;i<=b;i++){
            if(check[i]==true){
                continue;
            }
            if(check[i]==false){
                prime[pn++]=i;
                for(int j=i+i;j<=b;j+=i){ // a=3이면 6부터 13까지 중 3의 배수 삭제 
                    check[j]=true;
                }
            }
        }
        for(int i=a;i<=b;i++){
            if(check[i]==false){
                System.out.println(i);

                

            }
        }

    }
    
}
