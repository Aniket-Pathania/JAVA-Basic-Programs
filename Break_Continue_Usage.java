package com.company;
public class Break_Continue_Usage {
    public static void main(String[] args){
        System.out.println("print a loop but stop at a specific point");
        for(int i=0;i<5;i++){
            if(i==2){
                System.out.println("no sir");
                System.out.println(i);
                break;

            }
            System.out.println(i);
            System.out.println("ok done sir");
        }
        System.out.println("------------------------------------------------------------");
        System.out.println("print a loop and skip a specific spot");
        for (int r = 0;r<5;r+=1){
            if (r==2){
                System.out.println("not you sir");
                continue;
            }
            System.out.println(r);
            System.out.println("ok sir");

        }
    }
}
