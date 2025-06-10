package org.design.factorydesign.example3.vendors;

import org.design.factorydesign.example3.SmartLight;

public class PhilipsSmartLight implements SmartLight {
    @Override
    public String turnOn() {
        return "Philips light turned on";
    }

    @Override
    public String turnOff() {
        return "Philips light turned off";
    }

    @Override
    public Integer setBrightness() {
        return 100;
    }
}
