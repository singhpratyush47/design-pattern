package org.design.factorydesign.example2.factory;

import org.design.factorydesign.example2.Car;
import org.design.factorydesign.example2.Vehicle;

public class CarFactory extends VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return Car.builder().build();
    }
}
