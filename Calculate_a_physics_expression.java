package com.company;
import java.util.Scanner;
public class Calculate_a_physics_expression {
    public static void main(String[] args){
        System.out.println("We are calculating (v2-u2)/2as");

        System.out.println("Enter the value of v , u , a , s in order respectively.");
        Scanner sc = new Scanner(System.in);
        Float v = sc.nextFloat();Scanner ss = new Scanner(System.in);
        Float u = ss.nextFloat();

        Scanner se = new Scanner(System.in);
        Float a = se.nextFloat();

        Scanner sw = new Scanner(System.in);
        Float s = sw.nextFloat();

        Float vs = v*v;
        Float us = u*u;
        Float i = vs - us;
        Float o = 2*a*s;
        Float f = i/o;
        System.out.println("The expression (v2-u2)/2as is calculated as ");
        System.out.println(f);




    }
}
