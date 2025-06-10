package org.design.factorydesign.example2;

import lombok.Builder;
import lombok.Data;
import org.design.factorydesign.example2.components.Chasis;
import org.design.factorydesign.example2.components.Engine;
import org.design.factorydesign.example2.components.Wheels;

@Builder
@Data
public class Car implements Vehicle{
    @Override
    public Engine getEngine() {
        return Engine.builder().horsepower(700).build();
    }

    @Override
    public Chasis getChasis() {
        return Chasis.builder().chasisBody("Car Body").build();
    }

    @Override
    public Wheels wheels() {
        return Wheels.builder().count(4).build();
    }
}
