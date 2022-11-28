// create int variable and initialize it with numbers
//create oddCount variable and initialize to 0 ---keeps track of how many odd numbers there are
//create evenCount variable and initialize to 0 ---keeps track of how many even numbers there are
//create WHILE LOOP(if number is greater than 0 run condition)
// divide num value by 10
//use IF Statement to check if num is divisible by 2.
//INCREMENT either odd or even COUNT variable depending on the number
//Once loop is done sout oddCount and evenCount


public class CountEvenAndOddNumbers {
    public static void main(String[] args) {
        int num = 234548679;
        int oddCount = 0;
        int evenCount = 0;

        while (num > 0){
            num = num/10;

            if(num % 2 == 0){
            evenCount++;
        }else {
            oddCount++;
        }
        }
        System.out.println("Number of even numbers : " + evenCount);
        System.out.println("Number of odd numbers : " +oddCount);
    }
}
