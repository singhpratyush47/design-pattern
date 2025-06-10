package org.design.factorydesign.example3.factory;

import org.design.factorydesign.example3.SmartLight;
import org.design.factorydesign.example3.SmartLock;
import org.design.factorydesign.example3.SmartThermostat;

public abstract class SmartDeviceFactory {

    public abstract SmartLight createSmartLight();
    public abstract SmartThermostat createSmartThermostat();
    public abstract SmartLock createSmartLock();
}
