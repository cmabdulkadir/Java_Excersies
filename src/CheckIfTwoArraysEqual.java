//create and define 2 array of numbers
//create a boolean variable and initialize it to the array method .equals
//IF Statement to determine if both arrays are equal to each other or not

import java.util.Arrays;

public class CheckIfTwoArraysEqual {
    public static void main(String[] args) {

        int[] a = {1,2,4,4,5};
        int[] b = {1,2,3,4,5};

        boolean status = Arrays.equals(a,b);

        if (status == true){
            System.out.println("Both Arrays are equal");
        }else {
            System.out.println("Both Arrays are not equal");
        }


    }
}
