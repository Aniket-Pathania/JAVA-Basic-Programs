package com.company;
import java.util.Scanner;
public class Program_to_find_Factorial {
    public static void main(String[] args){
        int fact =1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for factorial");
        int a = sc.nextInt();
        if (a<0){
            System.out.println("no factorial for negative numbers");

        }
        else{
            for(int i =1;i<=a;i+=1){
                fact *=i;
            }
        }
        System.out.println("factorial of "+a+" is "+fact);
    }
}
