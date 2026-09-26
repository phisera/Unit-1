//1.2.6

public class Drug {
    private String name;
    private int dose; 

    public Drug (String name, int dose) {
        this.name = name;
        this.dose = dose;
    }

    public String getName() {
        return name;
    }

    public int getDose() {
        return dose;
    }
}
