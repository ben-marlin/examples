package edu.guilford;

// basic demo of input, output, and if / else

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        // instantiate scan object
        Scanner scanner = new Scanner(System.in);

        // use scanner to input an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // number % 2 calculates remainder on dividing by 2
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        // last line should always close scanner
        scanner.close();
    }
}
