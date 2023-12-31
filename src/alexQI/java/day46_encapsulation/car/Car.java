package alexQI.java.day46_encapsulation.car;

public class Car {
    //encapsulated/hidden instance variables
    private String model;
    private int year;
    private int mileage;

    //setter method for model
    public void setModel(String carModel) {
        model = carModel;
    }
    //getter method for model
    public String getModel() {
        return model;
    }

    //setter for year
    public void setYear(int year) {
        this.year = year;
    }

    //getter for year
    public int getYear() {
        return year;
    }

    //getter setter for mileage
    //generate to String
    public int getMileage() {
        return mileage; //this.mileage; also works fine
    }
    //myCar.setMileage(45230);
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }
}

