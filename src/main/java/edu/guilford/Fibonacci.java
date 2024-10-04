package edu.guilford;

// demo of basic use of for loop

public class Fibonacci {
    public static void main(String[] args) {

        // declare integer variables used
        int n1, n2, n3, count;

        // set starting terms
        n1 = 0; n2 = 1;

        // number of terms to print
        count = 10;

        // print first terms
        System.out.print(n1 + "\t" + n2);
        
        for (int i = 2; i < count; ++i) {
            n3 = n1 + n2;   // calculate next term

            System.out.print("\t" + n3); // print new term

            n1 = n2;        // slide terms to previous position
            n2 = n3;
        }

        System.out.println();   // advance to next line
    }
}

