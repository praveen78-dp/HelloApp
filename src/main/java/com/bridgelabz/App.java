package com.bridgelabz;

/**
 * UC3: Display "Hello" with Command-Line Argument or Default "World"
 */
public class App {
    public static void main(String[] args) {
        // Step 1: Set a default name
        String name = "World";

        // Step 2: If an argument is provided, override the default
        if (args.length > 0) {
            name = args[0];
        }

        // Step 3: Display the final message
        System.out.println("Hello " + name + "!");
    }
}