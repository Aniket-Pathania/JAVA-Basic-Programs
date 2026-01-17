package com.company;
import java.util.Scanner;
public class Operators{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Scanner bc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = bc.nextInt();
        System.out.println(a>b && 2>1);
        System.out.println(a>b || 3>1);

    }
}