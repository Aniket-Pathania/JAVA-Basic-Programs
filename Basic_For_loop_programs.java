package com.company;
public class Basic_For_loop_programs {
    public static void main(String[] args){
        System.out.println("Print first 10 numbers using for loop");
        for (int i=0; i<=10; i+=1) {
            System.out.println(i);
        }
        System.out.println("print first 10 odd numbers");
        for (int i =0; i<10; i+=1){
            System.out.println(2*i+1);
        }
        System.out.println("print numbers 5,4,3,2,1 respectively.");
        for (int i=5; i>0;i-=1){
            System.out.println(i);
        }
    }
}
