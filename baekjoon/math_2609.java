import java.util.*;
public class math_2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = gcd(a,b);
        int lcm = lcm(a,b,gcd);
        System.out.println(gcd);
        System.out.println(lcm);
    }

    //최대 공약수 
    public static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        else{
            return gcd(b,a%b);
        }
    }
    //최소 공배수는 a*b/최대 공약수 로 나타낼 수 있다 
    public static int lcm(int a,int b,int gcd){
        int result = (a*b)/gcd;
        return result;
    }
    
}
