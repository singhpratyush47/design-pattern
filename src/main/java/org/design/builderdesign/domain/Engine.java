package org.design.builderdesign.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class Engine {
    private final double volume;
    private double mileage;
    private boolean started;
}
