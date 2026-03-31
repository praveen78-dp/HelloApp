package com.bridgelabz;

/**
 * UC5: Display "Hello" with Multiple Command-Line Arguments using Enhanced For Loop
 */
public class App {
    public static void main(String[] args) {
        // If arguments are provided, use the Enhanced For Loop
        if (args.length > 0) {
            // "For each String 'name' in the 'args' array..."
            for (String name : args) {
                System.out.println("Hello " + name + "!");
            }
        } else {
            // Default greeting if array is empty
            System.out.println("Hello World!");
        }
    }
}