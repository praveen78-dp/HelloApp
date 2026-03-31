package com.bridgelabz;

/**
 * UC7: Display "Hello" using String.join() for multiple arguments
 */
public class App {
    public static void main(String[] args) {
        if (args.length > 0) {
            // String.join takes the delimiter (", ") and the array (args)
            // It automatically places the comma ONLY between elements
            String joinedNames = String.join(", ", args);
            
            System.out.println("Hello " + joinedNames + "!");
        } else {
            System.out.println("Hello World!");
        }
    }
}