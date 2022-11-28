//create a method called reverseString
//create a String variable and initialize;
//use .length method to find string length
//create a variable to hold new Strings in reverse order
//use a FOR loop to iterate through the String starting from the end of the String
//uSE CONCAT TO add each reverse character to the variable
//print rev String



public class ReverseString {

 static void reverseString(){

    String str = "ChaltuAbdulkadir";

    int len = str.length();
    String rev = "";
    for (int i = len -1; i >= 0 ; i--) {

        rev = rev + str.charAt(i);

    }
     System.out.println(rev);


}

    public static void main(String[] args) {
        reverseString();
    }

}
