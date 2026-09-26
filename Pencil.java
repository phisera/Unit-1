public class Pencil {
    private String brand;
    private String color;
    private int quality;
    private boolean isMechanical;
    private boolean isStolen;

   public Pencil(String brand, String colorInput, int quality, boolean isMechanical, boolean isStolen) {
    this.brand = brand;
     this.color = colorInput;
     this.quality = quality;
     this.isMechanical = isMechanical;
     this.isStolen = isStolen;
   }

   public Pencil(String brand, String colorInput) {
    this.brand = brand;
    this.color = colorInput;
    this.quality = 5;
    this.isMechanical = true;
    this.isStolen = false;
   }

   public Pencil (String brand){
    this.brand = brand;
    this.color = "yellow";
    this.quality = 3;
    this.isMechanical = false;
    this.isStolen = true;
   }


   public boolean isStolen() {
    return isStolen;
   }

   public String getBrand() {
    return brand;
    }

    public String getColor() {
        return color;
    }

    public int getQuality() {
        return quality;
    }

    public boolean getIsMechanical() {
        return isMechanical;
    }

    public boolean getIsStolen() {
        return isStolen;
    }

    public void setBrand(String brand) {
    this.brand = brand;
    }

    public void setColor(String color) {
    this.color = color;
    }

    public void setQuality(int quality) {
    this.quality = quality;
    }

    public void setIsMechanical(boolean isMechanical) {
    this.isMechanical = isMechanical;
    }

    public void setIsStolen(boolean isStolen) {
    this.isStolen = isStolen;
    }


   public static void bribePencilManufacturerToClaimAuthenticity(Pencil pencil, int dollars) {
        if (dollars >= 10) {
            pencil.setIsStolen(false);
        }
    }

    public static void bribePencilManufacturerToClaimAuthenticity(Pencil pencil, Drug drugs) {
       if (drugs.getName() == "coke" || drugs.getName() == "maruajana" && drugs.getDose() >= 100 ) {
            pencil.setIsStolen(false);
       }
    }

    public static void bribePencilManufacturerToClaimAuthenticity(Pencil pencil, Children children) {
        if (children.getNumber() >= 10) {
            pencil.setIsStolen(false);
        }
    }

    public String toString() {
        return "This " + brand + " pencil is " +
         (isStolen ? "stolen" : "not stolen") +
          " and " + color + ", quality graded at " +
           quality + ", and it is " + (isMechanical ? "a" : "not a") + " mechanical pencil."; // ...
    }
}