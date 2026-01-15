package com.company;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args){
        System.out.println("Enter your name");
        Scanner a = new Scanner(System.in);
        String name = a.next();
        System.out.println("Hello "+name+" have a nice day");
    }
}