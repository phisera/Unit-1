//1.2.6

public class Main {
    public static void main(String[] args){
        // Create multiple pencils
        Pencil boringPencil = new Pencil("Ticonderoga");
        Pencil defaultPencil = new Pencil("Company", "grey");
        Pencil monograph = new Pencil("Monograph","pink", 9, true, true); // created as stolen

        // Force the color of the monograph to be something else
        monograph.setColor("green");
    //    System.out.println(monograph.getColor()); // "green"

        // monograph.isStolen = false; // won't work because isStolen is private

        // Bribe the manufacturer of the monograph to claim authenticity
        Pencil.bribePencilManufacturerToClaimAuthenticity(monograph, 1);


        Drug maruajana = new Drug("maruajana", 1445);

        Pencil.bribePencilManufacturerToClaimAuthenticity(monograph, maruajana);

        Children children = new Children(5);
        
        Pencil.bribePencilManufacturerToClaimAuthenticity(boringPencil, children);

        System.out.println(monograph);
        System.out.println(boringPencil);
        System.out.println(defaultPencil);
    }
    
}