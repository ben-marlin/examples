package edu.guilford;

// demo of generating a random array, finding maximum

import java.util.Random;

public class LargestInArray {
    public static void main(String[] args) {
        // instantiate randomizer
        Random rand = new Random();

        // set number of terms
        int count = 10;

        // declare array of integers
        int[] numbers = new int[count];

        // randomize numbers 1-100
        for (int i = 0; i < count; i++) {
            numbers[i] = rand.nextInt(100) + 1;
        }

        // print array
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + "\t");
        }

        // feed a carriage return
        System.out.println();

        // initialize max
        int max = numbers[0];

        // if a value is larger, store it in max
        for (int i = 0; i < count; i++) {   
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("The largest number is: " + max);
    }
}