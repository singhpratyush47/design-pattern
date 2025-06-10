package org.design.factorydesign.example3;

import org.design.factorydesign.example3.factory.PhilipsSmartDeviceFactory;
import org.design.factorydesign.example3.vendors.PhilipsSmartLight;

public class Main {
    public static void main(String[] args) {

        PhilipsSmartDeviceFactory smartDeviceFactory = new PhilipsSmartDeviceFactory();
        System.out.println(smartDeviceFactory.createSmartLight());
    }
}
