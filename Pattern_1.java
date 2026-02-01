package com.company;
public class Pattern_1 {
    public static void main(String[] args){
        int n =4;
        for(int i = n;i>0;i-=1){
            for (int j=0;j<i;j+=1){
                System.out.print("*");

            }
            System.out.println("\n");
        }
    }
}
