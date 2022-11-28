//PRIME NUMBER -
        //NUMBER SHOULD BE A NATURAL NUMBER (GREATER THAN 1)
        // SHOULD ONLY HAVE 2 FACTORS 1 AND ITSELF

//create a variable and initialize it.
//create a count variable  to keep track of the number of factors
//IF statement to determine if num is  greater than 1
    //FOR LOOP to  iterate through
        //IF Statement to determine if num is divisible by 2 with no remainders -->
            //INCREMENT count by 1
        //IF statement to determine if count is equal to 2(two numbers) within the range if the num is divisible by only 2 numbers
        //then number is a PRIME NUMBER
            //ELSE -- number is NOT A PRIME NUMBER
public class PrimeNumberOrNot {
    public static void main(String[] args) {
        int num = 4;
        int count = 0;

        if(num > 1) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
                if (count == 2) {
                    System.out.println("PRIME NUMBER");
                } else {
                    System.out.println("NOT PRIME NUMBER");
                }

            }
        }
        else
        {
            System.out.println("NOT PRIME NUMBER");
        }

    }
}
