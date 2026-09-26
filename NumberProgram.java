// import java.util.Scanner;

public class NumberProgram {
    public static void main(String[] args) {
        /* Assignment: 1.1.6 Numbers Riddle 
        Name: Sophia Liao
        Date: 9/16/2026*/

        //declare variable
        int number = 20;

        //prints out the number
        System.out.println("Your number is " + number);
        
        //declare next number
        double number1 = number * 2;

        //prints out next number
        System.out.println("Your number divided by 2 is " + number1);

        //declare next number
        double number2 = number1 + 6;

        //prints out next number
        System.out.println("Your number plus 6 is " + number2);

        //declare next number
        double number3 = number2 / 2;

        //prints out next number
        System.out.println("Your number divided by 2 is " + number3);

        //declare next number
        int number4 = (int)number3 - number;

        //prints out next number
        System.out.println("Your number subtracted by the first number is " + number4);
        
    }
}