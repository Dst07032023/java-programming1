package Ecaterina.java2.day37_static.phone;

public class IPhone {

    // instance variables
    String model;
    String color;
    double price;
    int storage;

    //static variables
    static String os;
    static String brand;

    //static block used to initialized static variables
    static {
        System.out.println("STATIC BLOCK RUN");
        os = "IOS";
        brand = "Apple";
    }


    //constructor used to initialize instance variables
    public IPhone(String model, String color, double price, int storage) {
        System.out.println("CONSTRUCTOR RUN");
        this.model = model;
        this.color = color;
        this.price = price;
        this.storage = storage;
    }

    /*
    Difference between static block & constructor

    static block will run once, the first time the class is used
        -> we can write any code we want

    constructor will be called every time an object is made
     */

    @Override
    public String toString() {
        return "IPhone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", storage=" + storage +
                '}';
    }
}

