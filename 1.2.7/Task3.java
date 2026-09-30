public class Task3 {
    public static void main(String[] args) {
        String capital = "A";
        String lowercase = "a";
        capital.compareTo(lowercase);
        if (capital.compareTo(lowercase) < 0) {
            System.out.println("The capital letter is less than the lowercase letter.");
        } else if (capital.compareTo(lowercase) > 0) {
            System.out.println("The capital letter is greater than the lowercase letter.");
        } else {
            System.out.println("The capital letter is equal to the lowercase letter.");
        }

        String word1 = "Sophia";
        String word2 = "Sophie";
        word1.compareTo(word2);
        if (word1.compareTo(word2) < 0) {
            System.out.println("The first word (with a) is less than the second word (with e).");
        } else if (word1.compareTo(word2) > 0) {
            System.out.println("The first word (with a) is greater than the second word (with e).");
        } else {
            System.out.println("The first word (with a) is equal to the second word (with e).");
        }

        String number = "1Sophia";
        String letter = "Sophia";
        if (number.compareTo(letter) < 0) {
            System.out.println("The string with a number is less than the string with a letter.");
        } else if (number.compareTo(letter) > 0) {
            System.out.println("The string with a number is greater than the string with a letter.");
        } else {
            System.out.println("The string with a number is equal to the string with a letter.");
        }

        String substringonly = "Sophia";
        String substringplus = "SophiaLiao";
        if (substringonly.compareTo(substringplus) < 0) {
            System.out.println("The string that is a substring is less than the string that has more characters.");
        } else if (substringonly.compareTo(substringplus) > 0) {            
            System.out.println("The string that is a substring is greater than the string that has more characters.");
        } else {
            System.out.println("The string that is a substring is equal to the string that has more characters.");
        }

    }
}