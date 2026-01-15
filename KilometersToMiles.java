package com.company;
import java.util.Scanner;
public class KilometersToMiles {
    public static void main(String[] args){
        System.out.println("Enter the distance in kilometers to convert in miles");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextFloat();
        double b = a*0.62;
        System.out.println("The distance in miles is:");
        System.out.println(b);
    }
}
