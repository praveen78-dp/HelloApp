package com.bridgelabz;

/**
 * UC2: Hello User with Command-Line Argument
 */
public class App {
    public static void main(String[] args) {
        // We check if the user passed any words (arguments) when running the program
        if (args.length > 0) {
            // args[0] is the first word you type after the command
            String name = args[0]; 
            System.out.println("Hello " + name + "!");
        } else {
            // This runs if you forget to type a name
            System.out.println("Hello User!");
        }
    }
}