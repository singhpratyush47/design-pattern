package org.design.factorydesign.example1;

import org.design.factorydesign.example1.factory.AWSFactory;
import org.design.factorydesign.example1.factory.AzureFactory;
import org.design.factorydesign.example1.factory.CloudFactory;

public class Main {
    public static void main(String[] args) {
        CloudFactory awsFactory=new AWSFactory();
        System.out.println(awsFactory.uploadFile());

        CloudFactory azureFactory=new AzureFactory();
        System.out.println(azureFactory.uploadFile());

    }
}
