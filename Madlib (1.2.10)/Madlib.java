import java.util.Scanner;

public class Madlib {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective = scanner.nextLine();

        System.out.print("Enter a place: ");
        String place = scanner.nextLine();

        System.out.print("Enter an emotion: ");
        String emotion = scanner.nextLine();

        System.out.print("Enter a verb: ");
        String verb = scanner.nextLine();

        System.out.print("Enter a number: ");
        String number = scanner.nextLine();

        System.out.print("Enter a verb ending with -ing: ");
        String verbEndingWithIng = scanner.nextLine();

        System.out.print("Enter another emotion: ");
        String anotherEmotion = scanner.nextLine();

        System.out.print("Enter an adverb: ");
        String adverb = scanner.nextLine();

        System.out.print("Enter another verb: ");
        String anotherVerb = scanner.nextLine();

        System.out.print("Enter another place: ");
        String anotherPlace = scanner.nextLine();


        String madlib = "One day, <name> went to visit the <adjective> children's <place>."
        + "\n" + "Super <emotion>, they <verb> to the <adjective> children's <place>."
        + "\n" + "Imagine their shock when they saw <number> children <verbEndingWithIng>!"
        + "\n" + "<anotherEmotion>, they <adverb> <anotherVerb> back to <anotherPlace>!";

        madlib = madlib.replace("<name>", name);
        madlib = madlib.replace("<adjective>", adjective);
        madlib = madlib.replace("<place>", place);
        madlib = madlib.replace("<emotion>", emotion);
        madlib = madlib.replace("<verb>", verb);
        madlib = madlib.replace("<number>", number);
        madlib = madlib.replace("<verbEndingWithIng>", verbEndingWithIng);
        madlib = madlib.replace("<anotherEmotion>", anotherEmotion);
        madlib = madlib.replace("<adverb>", adverb);
        madlib = madlib.replace("<anotherVerb>", anotherVerb);
        madlib = madlib.replace("<anotherPlace>", anotherPlace);

        System.out.println(madlib);

        scanner.close();
    }
}
