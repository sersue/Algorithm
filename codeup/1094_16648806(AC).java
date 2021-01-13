import java.util.Scanner;
import java.util.ArrayList;
public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        ArrayList <Integer> attend = new ArrayList <Integer>();

        for(int i=0;i<n;i++){
            int k = sc.nextInt();
            attend.add(k);
        }
        for(int i=n-1;i>=0;i--){
            System.out.printf("%d ",attend.get(i));
        }
    }
}
