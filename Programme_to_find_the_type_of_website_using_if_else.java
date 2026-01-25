package com.company;
import java.util.Scanner;
public class Programme_to_find_the_type_of_website_using_if_else {
    public static void main(String[] args){
        System.out.println("Enter the website url (only .com,.org,.in)");
        Scanner sc = new Scanner(System.in);
        String Web = sc.next();
        if (Web.endsWith(".org")){
            System.out.println("it is an organisational website");
        }
        else if (Web.endsWith(".com")){
            System.out.println("it is an commercial website");
        }
        else if (Web.endsWith(".in")){
            System.out.println("it is an Indian website");
        }
        else {
            System.out.println("please enter a website ending with .com,.org,.in only");
        }

    }
}
