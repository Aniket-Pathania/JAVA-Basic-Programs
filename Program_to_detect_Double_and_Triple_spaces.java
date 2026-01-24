package com.company;
import java.util.Scanner;
public class Program_to_detect_Double_and_Triple_spaces {
    public static void main(String[] args){
        System.out.println("Enter your String with double or triple spaces");
        Scanner oo = new Scanner(System.in);
        String Enter = oo.nextLine();
        System.out.println("The double spaces are at index");
        System.out.println(Enter.indexOf("  "));
        System.out.println("The triple spaces are at index");
        System.out.println(Enter.indexOf("   "));

        // works perfectly with sentences like (Aniket  is   a good boy).
        // in future i will learn about loops and make it good.

    }
}
