import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main (String[] args) {
        ArrayList <Integer> sl = new <Integer> ArrayList();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sl.add(a);
        sl.add(b);
        sl.add(c);
        for(int i=0;i<3;i++){
            if(sl.get(i)%2==0){
                System.out.println(sl.get(i));
            }
        }
       


        
    }
}
