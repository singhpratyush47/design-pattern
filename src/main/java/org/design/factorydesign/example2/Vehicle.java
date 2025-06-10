package org.design.factorydesign.example2;

import org.design.factorydesign.example2.components.Chasis;
import org.design.factorydesign.example2.components.Engine;
import org.design.factorydesign.example2.components.Wheels;

public interface Vehicle {

    Engine getEngine();

    Chasis getChasis();

    Wheels wheels();
}
