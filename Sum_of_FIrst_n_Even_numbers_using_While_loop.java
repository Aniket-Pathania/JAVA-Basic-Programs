package com.company;
public class Sum_of_FIrst_n_Even_numbers_using_While_loop {
    public static void main(String[] args){
        int i =0;
        int sum=0;
        System.out.println("Even numbers till 10 are");
        while(2*i < 11){

            System.out.println(2*i);
            sum += 2*i;
            i+=1;

        }
        System.out.println("Addition of all them are");
        System.out.println(sum);
    }
}
