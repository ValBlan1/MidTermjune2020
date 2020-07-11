package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        String x = "MOM";
        x= x.replace(" ","");

        String reverse= "";
        for(int i= x.length()- 1; i >= 0; i--){
            reverse += x.charAt(i);
            System.out.println(reverse);
        }
        boolean palindrome = true;
        for(int i=0; i< x.length(); i++){
            if (x.charAt(i) != reverse.charAt(i)){
                palindrome = true;
            }
        }if (palindrome){
            System.out.println(" Is a Palindrome!");
        }else {
            System.out.println("Not a Palindrome");
        }

    }
}
