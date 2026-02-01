package com.company;
public class Sum_of_multiples_of_8 {
    public static void main(String[] args){
        System.out.println("Calculate the sum of ten multiples of 8  ");
        int sum=0;
        for (int i =0;i<=10;i+=1){
            sum+=8*i;
            

        }
        System.out.println("The sum is "+sum);
    }
}
