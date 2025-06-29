package org.design.factorydesign.example3.factory;

import org.design.factorydesign.example3.SmartLight;
import org.design.factorydesign.example3.SmartLock;
import org.design.factorydesign.example3.SmartThermostat;
import org.design.factorydesign.example3.vendors.PhilipsSmartLight;

public class PhilipsSmartDeviceFactory extends SmartDeviceFactory{
    @Override
    public SmartLight createSmartLight() {
        return new PhilipsSmartLight();
    }

    @Override
    public SmartThermostat createSmartThermostat() {
        return null;
    }

    @Override
    public SmartLock createSmartLock() {
        return null;
    }
}
