package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */

        int a = 0;
        int b = 1;

        int c;
        for(int i=0;i<=20;i++){
            c = a+b;
            System.out.println(b);
            a=b;
            b=c;
        }


    }
}
