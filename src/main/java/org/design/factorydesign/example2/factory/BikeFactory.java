package org.design.factorydesign.example2.factory;

import org.design.factorydesign.example2.Bike;
import org.design.factorydesign.example2.Vehicle;

public class BikeFactory extends VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return Bike.builder().build();
    }
}
