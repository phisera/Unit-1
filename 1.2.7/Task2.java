public class Task2 {
    public static void main(String[] args) {
        String motorcycle = "motorcycle";
        String recycle = "recycle";
        String mCycle = motorcycle.substring(5);
        String rCycle = recycle.substring(2);
        if (mCycle.equals(rCycle)) {
            System.out.println("The two strings are equal.");
        } else {
            System.out.println("The two strings are not equal.");
        }
    }

}
