package com.company;
import java.util.Scanner;
public class Encrypting_Decrypting_grades {
    public static void main(String[] args) {
        //Encryption
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the grade");
        char a = sc.next().charAt(0);
        char b = (char) (a + 8);
        System.out.println("The encrypted grade is +8 ");
        System.out.println(b);
        // Decryption
        char c = (char) (b - 8);
        System.out.println("The real grade was");
        System.out.println(c);

    }
}
