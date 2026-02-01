package com.company;
import java.util.Scanner;
public class Factorial_program_using_while_loop {
    public static void main(String[] args){
        int fact=1;
        int i =1;
        System.out.println("Enter the number to find factorial of");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a<0){
            System.out.println("factorial not available for negative numbers");

        }
        else {
            while(i<=a){
                fact*=i;
                i+=1;
            }
            System.out.println("factorial of "+a+" is "+fact);

        }
    }
}
