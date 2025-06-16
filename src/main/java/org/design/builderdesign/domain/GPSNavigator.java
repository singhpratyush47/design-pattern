package org.design.builderdesign.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class GPSNavigator {
    private String route;
}
