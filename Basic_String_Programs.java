package com.company;
import java.util.Scanner;
public class Basic_String_Programs {
    public static void main(String[] args){
        //1) Convert String to Lowercase


        System.out.println("Enter the Name to convert in lowe case");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String low = name.toLowerCase();
        System.out.println("The String in Lower Case is: ");
        System.out.println(low);


        //2) Program to replace spaces with underscores.


        System.out.println("Enter the string with spaces in it");
        Scanner ss = new Scanner(System.in);
        String Enter = ss.nextLine();
        String Removed_spaces = Enter.replace(" ","_");
        System.out.println("The string with replaced Spaces is");
        System.out.println(Removed_spaces);


        // 2)Program to format the following string using end character sequence
        // "Dear Aniket,These java programs are so good.Thanks"


        String Same = "Dear Aniket,\nThese java programs are so good.\nThanks";
        System.out.println(Same);




    }
}
