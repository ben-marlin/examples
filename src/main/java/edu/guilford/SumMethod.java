package edu.guilford;

// demo of basic method

public class SumMethod {
    public static void main(String[] args) {
        // declare and initialize values
        int a = 5, b = 10;

        // function call
        int result = sum(a, b);

        // print result
        System.out.println(a + " + " + b + " = " + result);
    }

    // method outside main method
    public static int sum(int x, int y) {
        return x + y;
    }
}

