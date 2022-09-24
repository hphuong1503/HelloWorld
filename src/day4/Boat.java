package day4;

public class Boat extends Vehicle implements IMove {

    int numberOfSeat;

    public Boat(int numberOfSeat, String make) {
        this.numberOfSeat = numberOfSeat;
        this.make = make;
        this.wheels = 0;
    }

    @Override
    public String move() {
        return "splosh slash";
    }
}
