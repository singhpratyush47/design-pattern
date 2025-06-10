package org.design.factorydesign.example2.factory;

import org.design.factorydesign.example2.Truck;
import org.design.factorydesign.example2.Vehicle;

public class TruckFactory extends VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return Truck.builder().build();
    }
}
