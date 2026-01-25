package com.company;
import java.util.Scanner;
public class Basic_Conditional_programme {
    public static void main(String[] args){
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age==18) {
            System.out.println("adult");
        }
        else if (age==10) {
            System.out.println("child");
        }
        else if (age==50) {
            System.out.println("big adult");
        }
        else if (age==80){
            System.out.println("senior citizen");
        }
        else{
            System.out.println("enter values 18,10,50,60 only.");
        }


    }
}
