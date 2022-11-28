// create and array of strings
//

public class DuplicateElementInArray {
    public static void main(String[] args) {

        String[] str = {"java", "C", "C++", "Python", "java"};

        String dup = str[0];

        for (int i = 1; i <str.length ; i++) {

            if(dup.equalsIgnoreCase(str[i])){

                System.out.println("Duplicate found!");
            }else {
            }

        }
        System.out.println("No duplicate found");


    }
}
