import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Welcome to this Survey! What is your name?");
    String name = scanner.nextLine();
    System.out.println("Hello, " + name + "!");
    System.out.println("What is your age?");
    int age = scanner.nextInt();
    System.out.println("Are you a minor? (true/false)");
    boolean isMinor = scanner.nextBoolean();
    if (isMinor) {
        System.out.println("Ooooooh. Yum");
    } else {
        System.out.println("If you say so. I guess you are an adult then.");
    }
    System.out.println("What time do you wake up in the morning? (decimal format, e.g., 7.5 for 7:30 AM)");
    double wakeUpTime = scanner.nextDouble();
    if (isMinor) {
        System.out.println("Nice to know...");
    } else {
        System.out.println("You wake up at " + wakeUpTime + " AM. That's a reasonable time for an adult.");
    }
    System.out.println("Did you enjoy this survey? (true/false)");
    boolean enjoyedSurvey = scanner.nextBoolean();
    if (enjoyedSurvey) {
        System.out.println("I'm glad you enjoyed it!");
    } else {
        System.out.println("Chomp chomp. I guess you didn't enjoy it.");
    }

    System.out.println("Thank you for participating in this survey, " + name + "!");
    System.out.println("Here are your responses:");
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Is Minor: " + isMinor);
    System.out.println("Is Yummy: " + (isMinor ? "true" : "false"));
    System.out.println("Wake Up Time: " + wakeUpTime);
    System.out.println("Alive: " + enjoyedSurvey);

    scanner.close();
    }
}
