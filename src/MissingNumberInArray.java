//Array should not have duplicates
//Array does not need to be in sorted order
//Values should be in range

//create and array of integers
//create 2 int variables sum1 and sum 2 and initialize to 0;
//first FOR LOOP to iterate through array Find the sum of all the elements in the array
    //add i to sum1

// second For Loop to iterate thorough array and sum all the values including missing number
//sum of the range
        //add i to sum2

//Find missing num by taking the differences between each sum (sum2-sum1)

public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] num = {1,2,4,5};
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < num.length; i++) {

            sum1 = sum1 + num[i];

        }
        //System.out.println(sum1);
        for (int i = 1; i <= 5; i++) {
            sum2 = sum2 + i;
        }
        //System.out.println(sum2);

        System.out.println("The missing number is: " + (sum2 - sum1));
    }
}
