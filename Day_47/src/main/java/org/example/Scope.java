package org.example;

public class Scope {

    public static void main(String[] args) {

        int a =10;

        {
             a=101;
             int c=100;
            System.out.println(c);

        }
        int c=111;
        System.out.println(c);
        System.out.println(a);

    }
}
