package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter English marks out of 100 ");
        Scanner ab = new Scanner(System.in);
        int a = ab.nextInt();
        System.out.println("Enter Math marks out of 100");
        Scanner abb = new Scanner(System.in);
        int b = abb.nextInt();
        System.out.println("Enter the Physics  marks out of 100");
        Scanner cc = new Scanner(System.in);
        int c = cc.nextInt();
        System.out.println("Enter the chemistry marks out of 100");
        Scanner dd = new Scanner(System.in);
        int d = dd.nextInt();
        System.out.println("Enter the CS marks out of 100");
        Scanner ee = new Scanner(System.in);
        int e = ee.nextInt();
        double sum = a+b+c+d+e;
        double per = (sum/500)*100;
        System.out.println("the requred percentage is:");
        System.out.print(per);
        System.out.println("%");

    }
}