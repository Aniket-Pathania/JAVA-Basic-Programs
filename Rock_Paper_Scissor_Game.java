package com.company;
import java.util.Scanner;
import java.util.Random;
public class Rock_Paper_Scissor_Game {
    public static void main(String[] args){
        System.out.println("Enter the 1--> Rock , 2--> Paper , 3--> Scissor");
        Scanner sc = new Scanner(System.in);
        int Enter = sc.nextInt();
        System.out.print("You Entered  ");
        System.out.println(Enter);
        Random rand = new Random();
        int Computer = rand.nextInt(1,4);
        System.out.println("Computer Chooses "+Computer);
        if ((Enter==1 && Computer==3)||(Enter==2 && Computer==1) || (Enter==3 && Computer==2) ) {
            System.out.println("You win Computer lose.You saved the world from AI invasion.");
        }
        else if ((Enter==1 && Computer == 2) || (Enter ==2 && Computer==3) || (Enter==3 && Computer ==1)) {
            System.out.println("Computer wins and AI takes over the world you lose what a failure!!");
        }
        else {
            System.out.println("Enter the number 1,2,3 only and 1--> Rock , 2--> Paper , 3--> Scissor");
        }

    }
}
