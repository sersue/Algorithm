﻿import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();
        double b = Math.pow(r,n-1);
        System.out.println(a*(long)b);

    }
}
