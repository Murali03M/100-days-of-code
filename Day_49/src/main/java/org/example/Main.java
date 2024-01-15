package org.example;

public class Main {
    static void printl() {
        System.out.println("printing");
        // Uncomment the line below if you want to stop the recursion at some point
        // return;
        printl();
    }

    public static void main(String[] args) {
        printl();
        System.out.println("Hello, world!");
    }
}
