package com.company;
import java.util.Scanner;
public class Programme_to_determine_whether_a_student_is_pass_or_fail_using_if_else {
    public static void main(String[] args){
        System.out.println("The marks of 3 subjects ");
        System.out.println("Enter the marks in Physics out of 100");
        Scanner sc = new Scanner(System.in);
        Float Phy = sc.nextFloat();
        System.out.println("Enter the marks in Chemistry out of 100");
        Scanner ss = new Scanner(System.in);
        Float Chem = ss.nextFloat();
        System.out.println("Enter the marks in Maths out of 100");
        Scanner so = new Scanner(System.in);
        Float Maths = so.nextFloat();
        Float total  = Phy+Chem+Maths;
        Float per = (total/300)*100;
        System.out.println("The total percentage is ");
        System.out.println(per);
        if (per>=40 && Maths>=33 && Chem>=33 && Phy>=33){
            System.out.println("The criteria is fulfilled and you are promoted(pass)");
        }
        else {
            System.out.println("fail");
        }


    }
}


//criteria is 40% in overall percentage and 33% individual subject percentages.

