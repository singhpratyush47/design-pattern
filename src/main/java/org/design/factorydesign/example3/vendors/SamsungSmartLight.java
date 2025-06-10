package org.design.factorydesign.example3.vendors;

import org.design.factorydesign.example3.SmartLight;

public class SamsungSmartLight implements SmartLight {
    @Override
    public String turnOn() {
        return "Samsung Smart light on";
    }

    @Override
    public String turnOff() {
        return "Samsung smart light off";
    }

    @Override
    public Integer setBrightness() {
        return 200;
    }
}
