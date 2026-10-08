//Sophia Liao
//1.2.8
//10/8/2026
//APCSA

public class MathProgram {

    // Calculates the hypotenuse of a right triangle
    public static double calculateHypotenuse(double base, double height) {

        // Square the base
        double baseSquared = java.lang.Math.pow(base, 2.0);

        // Square the height
        double heightSquared = java.lang.Math.pow(height, 2.0);

        // Add the two squared values
        double sum = baseSquared + heightSquared;

        // Find the square root of the sum
        double hypotenuse = java.lang.Math.sqrt(sum);

        // Return the hypotenuse
        return hypotenuse;
    }

    public static int randomInteger(int lowest, int highest) {

    //(highest - lowest + 1) = range of numbers, + lowest shifts the range to start from the lowest number

    int randomNumber = (int)(java.lang.Math.random() * (highest - lowest + 1)) + lowest;

    return randomNumber;   
    }

    public static void main(String[] args) {

        // Test the hypotenuse method with normal values
        System.out.println("Hypotenuse: " + calculateHypotenuse(3, 4));

        // Test with a zero value
        System.out.println("Hypotenuse: " + calculateHypotenuse(0, 5));

        // Test with decimal values
        System.out.println("Hypotenuse: " + calculateHypotenuse(1.5, 2.5));

        // Test with larger values
        System.out.println("Hypotenuse: " + calculateHypotenuse(30, 40));


        // Test the random integer method with a normal range
        System.out.println("Random number from 1 to 10: " + randomInteger(1, 10));

        // Test with negative numbers
        System.out.println("Random number from -10 to 10: " + randomInteger(-10, 10));

        // Test with the same lowest and highest value
        System.out.println("Random number from 5 to 5: " + randomInteger(5, 5));

        // Test with a range containing zero
        System.out.println("Random number from 0 to 1: " + randomInteger(0, 1));
    }
}