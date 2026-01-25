package com.company;
import java.util.Scanner;
public class Programme_to_check_leap_year {
    public static void main(String[] args){
        System.out.println("Enter the year to check whether it is leap year or not?");
        Scanner sc = new Scanner(System.in);
        int year  = sc.nextInt();
        if (year%400==0 || (year%4==0 && year%100!=0)){
            System.out.println("yes leap year");

        }
        else{
            System.out.println("not a leap year");
        }
    }
}
