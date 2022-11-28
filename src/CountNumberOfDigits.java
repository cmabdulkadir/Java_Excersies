// create int variable and initialize it with numbers
//create count variable and initialize to 0 ---keeps track of how many numbers there are
//create WHILE LOOP(if number is greater than 0 run condition)
// divide num value by 10
//INCREMENT COUNT variable
//Once loop is done sout(count)


public class CountNumberOfDigits {
    public static void main(String[] args) {

        int num = 2343451;
        int count = 0;

       while (num > 0){

            num = num/10; // eliminates last number in every iteration and stores it in stores it in same num variable
            count++;

        }
        System.out.println(count);
    }

}
