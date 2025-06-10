package org.design.factorydesign.example2;

import org.design.factorydesign.example2.factory.CarFactory;
import org.design.factorydesign.example2.factory.TruckFactory;
import org.design.factorydesign.example2.factory.VehicleFactory;

public class Main {

    public static void main(String[] args) {


        System.out.println("==========Car==========");
        VehicleFactory carFactory = new CarFactory();
        System.out.println(carFactory.getEngine());
        System.out.println(carFactory.getChasis());
        System.out.println(carFactory.getWheels());
        System.out.println("=======================");

        System.out.println("==========Truck==========");
        VehicleFactory truckFactory = new TruckFactory();
        System.out.println(truckFactory.getEngine());
        System.out.println(truckFactory.getChasis());
        System.out.println(truckFactory.getWheels());
        System.out.println("=======================");
    }
}
