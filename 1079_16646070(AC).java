﻿import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            char a = sc.next().charAt(0);
            if(a!='q'){
                System.out.println(a);
            }
            else{
                System.out.println(a);
                break;
            }
        }
    }
}
