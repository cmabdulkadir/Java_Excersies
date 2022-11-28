//PALINDROME STRING IS WHEN A STING REMAINS THE SAME WHEN REVERSED
//CREATE a method called palindromeSting
//Create a new scanner to take users input
//Create String variable to take user input
//SET a String variable equal to variable used to take user input// to original STRING
//create String variable and initialize to an empty string. This  variable will hold the String value in reverse order
//create FOR LOOP iterate through the String values
//create logic to reverse String
//create a IF statement to compare reverse STRING to original STRING
//IF same print "This STRING is a Palindrome String!"
//  ELSE "This is not a Palindrome String"


import java.util.Scanner;

public class PalindromeString {

    Scanner scan = new Scanner(System.in);

    public void palindromeString(){

        System.out.println("Enter a String: ");
        String str = scan.nextLine();
        String rev = "";
        int len = str.length();
        String org = str;

        for (int i = len -1; i >= 0 ; i--) {

            rev = rev + str.charAt(i);

        }
        if(org.equalsIgnoreCase(rev)){
            System.out.println("This STRING is a Palindrome String!");
        }else{
            System.out.println("This is not a Palindrome String");
        }

    }

    public static void main(String[] args) {
    PalindromeString s = new PalindromeString();
    s.palindromeString();
    }
}
