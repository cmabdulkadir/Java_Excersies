
//create a method that's called swapTwoNumbers that takes in two int parameters a and b
//create a third int variable that will be equal to variable  a
//set a equal to b and b equal the third variable


public class SwapTwoNumbers {

static void swapTwoNumbers(int a, int b){

    System.out.println("Before swap numbers are: " + a + " and " + b);
    int t = a;
    a = b;
    b = t;
    System.out.println("After swap numbers are: " + a + " and " + b);
}
    public static void main(String[] args) {
        swapTwoNumbers(3,8);
    }

}
