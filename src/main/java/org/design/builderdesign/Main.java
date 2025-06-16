package org.design.builderdesign;

import org.design.builderdesign.domain.*;

public class Main {
    public static void main(String[] args) {

        Car build = CarBuilder.builder()
                .transmission(Transmission.AUTOMATIC)
                .carType(CarType.CITY_CAR)
                .engine(Engine.builder()
                        .volume(100).mileage(200)
                        .started(true).build())
                .tripComputer(TripComputer.builder().build())
                .gpsNavigator(GPSNavigator.builder().build())
                .build();
        System.out.println(build);
    }
}
