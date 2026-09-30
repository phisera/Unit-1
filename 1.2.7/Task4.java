public class Task4 {
    public static void main(String[] args) {
        String word1 = "Eat";
        String word2 = "Children";
        String fullMessage = word1 + " " + word2;
        System.out.println(fullMessage);

        String e = word1.substring(0, 1);
        System.out.println(e);

        String child = word2.substring(0,5);
        System.out.println(child);

        System.out.println(e + e + e + e + " " + child + "!");
    }
}
