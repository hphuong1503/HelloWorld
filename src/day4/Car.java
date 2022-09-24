package day4;

public class Car extends Vehicle implements IMove{
    int year;

    public Car(int year, String make) {
        this.year = year;
        this.make = make;
    }

    @Override
    public String move() {
        System.out.println("Car move");
        return "vRoom";
    }
}
