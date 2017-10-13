import java.util.Scanner;

import static java.lang.Integer.getInteger;
import static java.lang.Integer.parseInt;

public class FizzBuzzBonus
{
    public static void main(String[] args)
    {
        int counter = 0;
        int counter1 = 0;
        int counter2 = 0;
        int number;
        int i = 1;
        System.out.println("enter a number");

        Scanner keyboard = new Scanner(System.in);
        number = keyboard.nextInt();

        while (number <= 1) {
            System.out.println(" enter another number greater than 1");
            number = keyboard.nextInt();
        }

        for (i = 1; i <= number; i++) {

            //  System.out.println("enter a number greater than 1:");
            // number = keyboard.nextInt();
            //      if (i% 15 == 0) {
            //          System.out.println("FizzBuzz");

            if (i >= 1) {
                //System.out.println(" enter another number great than 1");
            }
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");

            } else if (i % 7 == 0) {
                counter++;

                System.out.println(String.valueOf(i));
            } else if (i % 17 == 0) {
                counter1++;
                System.out.println(String.valueOf(i));
            } else if (i % 23 == 0) {
                counter2++;
                System.out.println(String.valueOf(i));

            } else {
                System.out.println(String.valueOf(i));
            }
        }

        System.out.println(counter + " " + counter1 + " " + counter2);

    }
}

