package com.company;
public class Print_multiplication_table_of_10_in_reverse_order {
    public static void main(String[] args){
        System.out.println("Printing table of 10 in reverse");
        for (int i = 10; i>=0 ; i-=1){
            System.out.println(10 + " * "+i+" = "+ 10*i);
        }
    }
}
