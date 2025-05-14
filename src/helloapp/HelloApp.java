package helloapp;

import java.util.Scanner;

/**
 * A simple program that prints to standard output
 * a String given by the user through standard input.
 * Note: User is asked to type their name
 */
public class HelloApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.nextLine();

        System.out.println("Hello " + name + "!");
    }
}

