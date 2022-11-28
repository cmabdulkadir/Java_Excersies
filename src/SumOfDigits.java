//create a variable and initialize to numbers
// create a sum variable and initialize to 0
//create WHILE LOOP - to iterate through the num value
//extract each number from the num variable
//add extracted num to the sum

public class SumOfDigits {
    public static void main(String[] args) {

        int num = 23432;
        int sum = 0;

        while (num > 0){

            sum = sum + num%10;

            num = num/10;

        }
        System.out.println("Sum of numbers is: " +sum);
    }
}
