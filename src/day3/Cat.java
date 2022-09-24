package day3;

public  class Cat extends  Animal{



    int year;
    String make;
    @Override
    public void speak() {
        System.out.println("Moew");
    }

    @Override
    public String toString() {
        return year +" "+ make;
    }


}
