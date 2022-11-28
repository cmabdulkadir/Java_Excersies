//create and array of integers
// create an initial max variable equal to the first element in the array
// create an initial min variable equal to the first element in the array
//  FOR LOOP to iterate through the array
        //IF Statement to determine if elements in the array are greater than the max or less than the min
            //IF so max variable set to equal i

public class MaxAndMinElementsInArray {
    public static void main(String[] args) {

        int[] num = {50,30,40,20,60};
        int max = num[0];
        int min = num[0];

        for (int i = 1; i < num.length; i++) {
            if(max < num[i]){
                max = num[i];
                System.out.println("The Max number is: "+max);
            } else if (num[i] < min) {
                min = num[i];
            }
        }
        System.out.println("The Min number is: " +min);
    }
}
