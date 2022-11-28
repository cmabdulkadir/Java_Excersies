// create an array of random integers
//create int variable sum and initialize to 0;
//use FOR LOOP to iterate through the array
    // extract each value and add to the sum variable
//Print sum


public class SumOfElementInArray {
    public static void main(String[] args) {


    int[] num = {1,2,3,4,5};
    int sum = 0;

       for (int i = 0; i < num.length; i++) {

            sum = sum + num[i];
        }
        System.out.println(sum);

//
//        for (int v: num) {
//            sum = sum + v;
//        }
//        System.out.println(sum);
}}
