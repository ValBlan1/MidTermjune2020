package math.problems;

import org.testng.Assert;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.
        Assert.assertEquals(78497,PrimeNumber.isPrime(78497));

        int  array[] = new int[]{211,110,99,34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65};
        // Assert.assertEquals(5,LowestNumber.);

        int [] array2 = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        Assert.assertEquals(9,FindMissingNumber.getMissingNumber(array2));


        Assert.assertEquals(120,Factorial.factorial(3));
        Assert.assertEquals(120,Factorial.factorial(3));

    }
}