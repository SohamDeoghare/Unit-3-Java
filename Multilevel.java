

class Vehicle {
    void get1() {
        int chassis;
        int engine_no;
        double amt;
        String clr, brand, vhno;
    }
}


class Car extends Vehicle {
    void get2() {
        int chassis=434;
        int engine_no=345;
        double amt=6000000;
        String clr="Grey", brand="Mercedes",vhno = "MH14KX2929";
        System.out.println("Car Details:\n");
        System.out.println("Chassis Number:"+chassis);
        System.out.println("Engine Number: "+engine_no);
        System.out.println("Amount: " +amt);
        System.out.println("Color: "+clr);
        System.out.println("Brand: "+brand);
        System.out.println("Vehicle Number: "+vhno);
        System.out.println("------------------------------------------------------------------------------------\n");
    }
}


class Bike extends Car {
    void get3() {
        int chassis = 323;
        int engine_no = 456;
        double amt = 600000;
        String clr = "Black", brand = "Yamaha", vhno = "MH14KJ2929";
        System.out.println("Bike Details:\n");
        System.out.println("Chassis Number: "+chassis);
        System.out.println("Engine Number: "+engine_no);
        System.out.println("Amount: "+amt);
        System.out.println("Color: "+clr);
        System.out.println("Brand: "+brand);
        System.out.println("Vehicle NUmber: "+vhno);
        System.out.println("------------------------------------------------------------------------------------");

    }
}


public class Multilevel {
    public static void main(String[] args) {

        Bike b = new Bike();
        b.get1();
        b.get2();
        b.get3();
    }
}
