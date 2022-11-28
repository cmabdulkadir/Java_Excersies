//Create a method called reverseNumber
//Create a scanner class that will take users input
//create a variable that will take users input
//create a variable that will store the reverse number
//use a WHILE loop to loop through the numbers with reverse logic and
//Return numbers in reverse order


import java.util.Scanner;

public class ReverseNumber {

    Scanner scan = new Scanner(System.in);
    public void reverseNumber(){
        System.out.println("Enter a series of number");
        int num = scan.nextInt();
        int reverse = 0;
        while(num !=0){

            reverse = reverse*10 + num%10; // rever
            num = num/10; //this eliminates the end value/ and repeats loop

        }

        System.out.println("Reverse Number is:" + reverse);

    }







    public static void main(String[] args) {

    }

}
