package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



   sum();

        System.out.println("Hello world!");
    }


   static void sum()
    {
        Scanner in = new Scanner(System.in);

        int num= in.nextInt();
        int num2=in.nextInt();

        int sum=num+num2;


        System.out.println(sum);
    }
}