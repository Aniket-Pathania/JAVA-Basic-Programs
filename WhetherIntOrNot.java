package com.company;
import java.util.Scanner;
public class WhetherIntOrNot {
    public static void main(String[] args) {
        System.out.println("Enter the number to check whether it is int or not?");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
    }
}
