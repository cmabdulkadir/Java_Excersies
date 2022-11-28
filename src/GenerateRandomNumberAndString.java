//use built-in random class
//create a new object for random class
//CALL the method nextInt will generate random integer


import java.util.Random;

public class GenerateRandomNumberAndString {
    public static void main(String[] args) {

        //APPROACH 1
        Random rand = new Random();

        int randInt = rand.nextInt(100);
        System.out.println(randInt);


        //APPROACH2
        System.out.println(Math.random());

        //APPROACH 3
        //http://commons.apache.org/
        //String randNum = RandomStringUtils.randomNumberic(5);
        //System.out.println(randNum);


    }
}
