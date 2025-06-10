package org.design.factorydesign.example2;

import lombok.Builder;
import lombok.Data;
import org.design.factorydesign.example2.components.Chasis;
import org.design.factorydesign.example2.components.Engine;
import org.design.factorydesign.example2.components.Wheels;

@Builder
@Data
public class Bike implements Vehicle{
    @Override
    public Engine getEngine() {
        return Engine.builder().horsepower(150).number(1234).build();
    }

    @Override
    public Chasis getChasis() {
        return Chasis.builder().chasisBody("2 wheeler").build();
    }

    @Override
    public Wheels wheels() {
        return Wheels.builder().count(2).build();
    }
}
