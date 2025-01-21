

class Vehicle1 {
    void get1() {
        int chassis;
        int engine_no;
        double amt;
        String clr, brand, vhno;
    }
}


class Electricvh extends Vehicle1 {
    void geltrc() {
        int chassis=434;
        int engine_no=345;
        double amt=6000000;
        String clr="Green", brand="Mercedes",vhno = "MH14KX2929";
        System.out.println("This Vehicle Runs on Petrol\n");
        System.out.println("Eletctric car Details:\n");
        System.out.println("Chassis Number:"+chassis);
        System.out.println("Engine Number: "+engine_no);
        System.out.println("Amount: " +amt);
        System.out.println("Number plate color: "+clr);
        System.out.println("Brand: "+brand);
        System.out.println("Vehicle Number: "+vhno);
        System.out.println("------------------------------------------------------------------------------------\n");
    }
}


class Petrolvh extends Vehicle1 {
    void getptrl() {
        int chassis = 323;
        int engine_no = 456;
        double amt = 600000;
        String clr = "Black", brand = "Toyota", vhno = "MH14KJ2929";
        System.out.println("This vehicle runs on petrol\n");
        System.out.println("Petrol Car Details:\n");
        System.out.println("Chassis Number: "+chassis);
        System.out.println("Engine Number: "+engine_no);
        System.out.println("Amount: "+amt);
        System.out.println("Color: "+clr);
        System.out.println("Brand: "+brand);
        System.out.println("Vehicle NUmber: "+vhno);
        System.out.println("------------------------------------------------------------------------------------");

    }
}


public class Hierarchical {
    public static void main(String[] args) {
        Electricvh v1 = new Electricvh();
        v1.geltrc();
        Petrolvh p1 = new Petrolvh();
        p1.getptrl();
    }
}
