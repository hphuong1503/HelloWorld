package day4;

public class Bike extends Vehicle implements IMove {

    public int distance;

    public Bike() {
    }

    public Bike(int distance, String make) {
        this.distance = distance;
        this.make = make;
        this.wheels = 2;
    }

    public void setDistance(int distance){
        this.distance = distance;
    }

    @Override
    public String move() {
        return "RRRRr";
    }
}
