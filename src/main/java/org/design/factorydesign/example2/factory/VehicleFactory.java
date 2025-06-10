package org.design.factorydesign.example2.factory;

import org.design.factorydesign.example2.Vehicle;
import org.design.factorydesign.example2.components.Chasis;
import org.design.factorydesign.example2.components.Engine;
import org.design.factorydesign.example2.components.Wheels;

public abstract class VehicleFactory {

    abstract Vehicle createVehicle();

    public Engine getEngine(){
        return createVehicle().getEngine();
    }

    public Chasis getChasis(){
        return createVehicle().getChasis();
    }

    public Wheels getWheels(){
        return createVehicle().wheels();
    }
}
