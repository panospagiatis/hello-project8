package helloapp;

import java.util.Scanner;
import java.time.LocalTime;

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

        LocalTime now = LocalTime.now();        // gets the current local time
        int hour = now.getHour();               // gets the hour (0 to 23)

        if (hour < 12) {
            System.out.println("Good morning, " + name + "!");
        } else if (hour < 18) {
            System.out.println("Good afternoon, " + name + "!");
        } else {
            System.out.println("Good evening, " + name + "!");
        }
    }
}

