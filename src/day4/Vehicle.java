package day4;

public abstract class Vehicle implements IMove {
    public int wheels;
    public String make;

    public Vehicle() {
    }

    public Vehicle(int wheels) {
        this.wheels = wheels;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
