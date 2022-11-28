//create a method called findLargestOfThreeNum that takes in 3 int parameters
//create int variable and initialize to 0. This variable will be used to compare the numbers against eachother
//create IF statement to determine which of the three numbers is the largest
//print largest

public class FindLargestOfThreeNumbers {

     static void findLargestOfThreeNum(int a, int b, int c){

        int largest = 0;

        if (a > b && a > c){
            largest = a;
        }else if (b > a && b > c ){
            largest = b;
        }else {
            largest = c;
        }

        System.out.println("The largest of the three numbers is : " + largest);
    }


    public static void main(String[] args) {
        findLargestOfThreeNum(9,8,1);
    }


}
