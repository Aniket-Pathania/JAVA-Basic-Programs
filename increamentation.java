package com.company;
import java.util.Scanner;
public class increamentation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which you want the successor");
        int a = sc.nextInt();
        System.out.println("the successor of "+a+" is");
        System.out.println(++a);
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter the character for which you want the successor ");
        char c = ss.next().charAt(0);
        System.out.println("The successor of "+c + " is ");
        System.out.println(++c);

    }
}
