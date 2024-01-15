package org.example;



public class Recursion {



    public static void main(String[] args) {


        System.out.println( sum1(6));



    }



    public static int sum1(int n){

        if(n==1)
        {
            return 1;
        }


        return n + sum1(n-1);

    }


}
