import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int add =0;
     
        for(int i=1;;i++){
           add = add +i;
            if(add>=a){
                System.out.println(i);
                break;
            }  
        }
         
            
        
            
        
    }
}
