package string.problems;

import java.util.*;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        List<String> list = Arrays.asList(st.split(" "));
        Set<String> repetitive = new HashSet<String>(list);
        for (String duplicate : repetitive) {
            System.out.println(duplicate + " " + Collections.frequency(list, duplicate));
        }
        System.out.println(wordLengths(st));
    }
    public static ArrayList<Integer> wordLengths( String st2 )
    {

        String st1 = " " + st2 + " ";
        ArrayList<Integer> list = new ArrayList<Integer>();
        for ( int i = 0; i < st1.length(); i++ )
        { if ( st1.charAt(i) == ' ' )
            { for ( int j = i+1; j < st1.length() ; j++)
                { if ( st1.charAt(j) == ' ')
                    { list.add( j - i - 1 );
                        j = st1.length();
                    }
                }
            }
        }
        return list;
    }
}
