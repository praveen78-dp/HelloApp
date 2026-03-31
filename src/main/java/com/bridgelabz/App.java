package com.bridgelabz;

/**
 * UC6: Display "Hello" with Multiple Arguments and remove Trailing Delimiter
 */
public class App {
    public static void main(String[] args) {
        if (args.length > 0) {
            String greeting = "Hello ";
            
            // Build the string with commas
            for (String name : args) {
                greeting += name + ", ";
            }

            // greeting is currently "Hello Praveen, Rahul, "
            // We need to remove the last ", " (length - 2)
            greeting = greeting.substring(0, greeting.length() - 2);
            
            System.out.println(greeting + "!");
        } else {
            System.out.println("Hello World!");
        }
    }
}