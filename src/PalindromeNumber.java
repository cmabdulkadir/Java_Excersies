//PALINDROME NUMBER IS WHEN A NUMBER REMAINS THE SAME WHEN REVERSED
//CREATE a method called palindromeNumber
//Create a new scanner to take users input
//Create  int variable to take user input
//SET a int variable equal to variable used to take user input// to original numbers
//create int variable and initialize to 0. This will variable will hold the num value in reverse order
//create WHILE LOOP iterate through num values
//create logic to reverse num values
//create a IF statement to compare reverse numbers to original numbers
//IF same print "Numbers are Palindrome Number"



import java.util.Scanner;

public class PalindromeNumber {

    Scanner scan = new Scanner(System.in);

    public void palindromeNumber() {

        System.out.println("Enter number: ");
        int num = scan.nextInt();
        int org = num;
        int rev = 0;

        while (num != 0) {

            rev = rev * 10 + num % 10;

            num = num / 10;
        }
        if(rev == org){
            System.out.println("Number is Palindrome Number!");
        }else {
            System.out.println("Number is not a Palindrome Number");
        }

    }


    public static void main(String[] args) {
        PalindromeNumber p = new PalindromeNumber();
        p.palindromeNumber();
    }
}
