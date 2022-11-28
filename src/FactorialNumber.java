//Factorial - is a function that mutliplies a number by every number bellow it

//create int variable and initialize;
//create long variable called factorial and initial it to 1; this variable will store the factorial number
//Can be done in descending or ascending order
// (long allows factorial integer to be lengthy

//create a FOR LOOP that will start at the beginning of the num and then
        //multiply each i value into the next
//print factorial


public class FactorialNumber {
    public static void main(String[] args) {

        int num = 5;
        long factorial = 1;

        for (int i = 1; i <= num; i++) {

            factorial = factorial*i;
        }
        System.out.println(factorial);
    }
}
