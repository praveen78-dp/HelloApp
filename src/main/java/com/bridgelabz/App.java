package com.bridgelabz;

/**
 * UC4: Display "Hello" with Multiple Command-Line Arguments or Default Message
 */
public class App {
    public static void main(String[] args) {
        // Check if the user provided ANY arguments
        if (args.length > 0) {
            // Loop through each name provided in the arguments
            for (String name : args) {
                System.out.println("Hello " + name + "!");
            }
        } else {
            // Default message if no names are provided
            System.out.println("Hello World!");
        }
    }
}