package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */
        MakePyramid.printPyramid(20);
    }
    public static void printPyramid(int pyramidLevel) {
        for (int i=0; i<pyramidLevel; i++) {

            for (int j=pyramidLevel-i; j>1; j--) {
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++ ) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }



}

