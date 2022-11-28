//Fibonacci number - series of numbers in which each number is the sum of the two preceding numbers
//create a method that takes in two int parameters
//create int variable and initialize to 0;

//n1, n2 sum(n1 + n2)

public class FibonacciNumber {

//0 1 1 2 3 5 8 13 21 34

    static void fibonacciNumber(int n1, int n2) {
        int sum = 0;
        System.out.print(n1 + " " + n2); // 0 1
        for (int i = 2; i < 10; i++) {

            sum = n1 + n2; // 1
            System.out.print(" " + sum);
            n1 = n2; // 1
            n2 = sum; // 1

        }
    }

    public static void main(String[] args) {
        fibonacciNumber(2, 3);
    }
}
