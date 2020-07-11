package string.problems;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {
    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        String st1="CAT";
        String st2="ACT";
        System.out.println("The Strings are anagrams = " + anagram(st1,st2));

    }
    public static boolean anagram(String st1, String st2){
        char[] charArrayFromString1= st1.toCharArray();
        char[] charArrayFromString2= st2.toCharArray();
        Arrays.sort(charArrayFromString1);
        Arrays.sort(charArrayFromString2);
        return Arrays.equals(charArrayFromString1, charArrayFromString2);
    }
}



