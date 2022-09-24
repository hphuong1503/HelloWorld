import day4.Bike;
import day4.Boat;
import day4.Car;
import day4.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String args[]) {


//        tao ra danh sach cua 3 cai xe, duoc nguoi dung nhap vao

        ArrayList<Bike> listBike = new ArrayList<>();
        int size = 3;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < size; i++) {
            Bike bike = new Bike();

            System.out.println("input Distance: ");
            int distance = scanner.nextInt();
            bike.setDistance(distance);


            System.out.println("input make: ");
            String make = scanner.next();
            bike.setMake(make);

            listBike.add(bike);
            System.out.println("---------");

        }


        for (int i = 0; i < listBike.size(); i++) {
            Vehicle vehicle = listBike.get(i);
            System.out.println("index: " + i + "  make:  " + vehicle.getMake() + ",number of wheels:  " + vehicle.getWheels());
        }


    }


    public void a() {
        Vehicle bike = new Bike(100, "Harley");
        Vehicle bike2 = new Bike(120, "Harley");
        Vehicle car = new Car(1986, "Mers");
        Vehicle boat = new Boat(3, "Boaty");

        ArrayList<Vehicle> listVehicle = new ArrayList();

//       them 1 phan tu
        listVehicle.add(bike);
        listVehicle.add(bike2);
        listVehicle.add(car);
        listVehicle.add(boat);

        ArrayList<Vehicle> listVehicle2 = new ArrayList();
        Vehicle car2 = new Car(1999, "Toyota");
        Vehicle bike3 = new Car(1000, "honda");

        listVehicle.add(car2);
        listVehicle2.add(bike3);


//        danh sach da co 4 chiec

        System.out.println(listVehicle.size());

        for (int i = 0; i < listVehicle.size(); i++) {
            Vehicle vehicle = listVehicle.get(i);
            System.out.println("index: " + i + "  make:  " + vehicle.getMake() + ",number of wheels:  " + vehicle.getWheels());
        }

        listVehicle.addAll(listVehicle2);
        System.out.println(listVehicle.size());
    }


}
