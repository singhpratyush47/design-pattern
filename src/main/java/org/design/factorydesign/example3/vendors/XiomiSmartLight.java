package org.design.factorydesign.example3.vendors;

import org.design.factorydesign.example3.SmartLight;

public class XiomiSmartLight implements SmartLight {
    @Override
    public String turnOn() {
        return "Xiomi smart light on";
    }

    @Override
    public String turnOff() {
        return "Xiomi Smart light off";
    }

    @Override
    public Integer setBrightness() {
        return 150;
    }
}
