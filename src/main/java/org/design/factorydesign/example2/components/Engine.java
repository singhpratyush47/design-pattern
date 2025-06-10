package org.design.factorydesign.example2.components;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Engine {

    private Integer horsepower;
    private Integer number;
}
