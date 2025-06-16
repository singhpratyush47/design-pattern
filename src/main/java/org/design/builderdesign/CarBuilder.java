package org.design.builderdesign;

import lombok.Getter;
import org.design.builderdesign.domain.*;

@Getter
public class CarBuilder {
     private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;
    private double fuel = 0;

    public static CarBuilder builder(){
        return new CarBuilder();
    }

    public CarBuilder carType(CarType carType){
        this.carType=carType;
        return this;
    }

    public CarBuilder seats(int seats){
        this.seats=seats;
        return this;
    }

    public CarBuilder engine(Engine engine){
        this.engine=engine;
        return this;
    }

    public CarBuilder transmission(Transmission transmission){
        this.transmission=transmission;
        return this;
    }

    public CarBuilder tripComputer(TripComputer tripComputer){
        this.tripComputer=tripComputer;
        return this;
    }

    public CarBuilder gpsNavigator(GPSNavigator gpsNavigator){
        this.gpsNavigator=gpsNavigator;
        return this;
    }

    public CarBuilder fuel(double fuel){
        this.fuel=fuel;
        return this;
    }

    public Car build(){
        return new Car(this);
    }
}
