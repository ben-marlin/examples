package edu.guilford;

// demo of for loop, charAt() method

import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        // instantiate Scanner object
        Scanner scan = new Scanner(System.in);

        // input a string from user
        System.out.print("Type a word or phrase: ");
        String str = scan.nextLine().toUpperCase();

        // declare & initialize count
        int count = 0;

        // step through string characters
        for (int i = 0; i < str.length(); i++) {

            // pulls one character at a time
            char ch = str.charAt(i);  // upper case to simplify

            // advance count for any of A/E/I/O/U
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }
        }

        // print out result
        System.out.println("Number of vowels: " + count);

        // last command should close scanner
        scan.close();
    }
}