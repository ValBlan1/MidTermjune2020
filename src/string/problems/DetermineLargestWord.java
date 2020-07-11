package string.problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DetermineLargestWord {

    public static String theLargestWord(String largest){
        DetermineLargestWord largestWord =new DetermineLargestWord();
        Map<Integer,String> lenght = largestWord.findTheLargestWord(largest);
        int i=0;
        String value  =" ";
        for (Map.Entry<Integer,String> determineLength : lenght.entrySet()){
            if(i<determineLength.getKey()){
                i = determineLength.getKey();
                value = determineLength.getValue();

            }

        }
        return value;
    }
    public static void main(String[] args) {
        String s="Human brain is a biological learning machine";
        System.out.println("10 " + theLargestWord(s));
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
    }

    public static Map<Integer, String> findTheLargestWord(String largest){
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = " ";
        //implement
        String[] split = largest.split(" ");

        for(int i = 0;i<split.length; i++){
            map.put(split[i].length(),split[i]);
            
        }

        return map;
    }
}
