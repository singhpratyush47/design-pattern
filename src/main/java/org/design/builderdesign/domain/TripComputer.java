package org.design.builderdesign.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.design.builderdesign.Car;

@AllArgsConstructor
@Data
@Builder
public class TripComputer {
    private Car car;
}
