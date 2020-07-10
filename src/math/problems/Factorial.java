package math.problems;

import java.util.Scanner;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

        Scanner recursion = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = recursion.nextInt();
        int Factorial = factorial(num);
        System.out.println("Factorial number using Recursion is: " + Factorial);

        Scanner iteration = new Scanner(System.in);
        System.out.print("Enter the number:");
        int y = iteration.nextInt();
        int result = factorial(y);
        System.out.println("The factorial of " + y + " using Iteration is " + result);

    }
    public static int Factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    } static int factorial(int n) {
        int output;
        if(n==1){
            return 1;
        }
        output = factorial(n-1)* n;
        return output;

    }

}

