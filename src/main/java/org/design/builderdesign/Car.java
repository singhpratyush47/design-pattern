package org.design.builderdesign;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.design.builderdesign.domain.*;

public class Car {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;
    private double fuel = 0;

    Car(CarBuilder builder){

        this.carType=builder.getCarType();
        this.seats= builder.getSeats();
        this.engine=builder.getEngine();
        this.transmission=builder.getTransmission();
        this.tripComputer=builder.getTripComputer();
        this.gpsNavigator=builder.getGpsNavigator();
        this.fuel=builder.getFuel();
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                ", seats=" + seats +
                ", engine=" + engine +
                ", transmission=" + transmission +
                ", tripComputer=" + tripComputer +
                ", gpsNavigator=" + gpsNavigator +
                ", fuel=" + fuel +
                '}';
    }
}
