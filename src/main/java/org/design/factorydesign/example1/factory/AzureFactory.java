package org.design.factorydesign.example1.factory;

import org.design.factorydesign.example1.AzureFileUploader;
import org.design.factorydesign.example1.FileUploader;
import org.design.factorydesign.example1.ObjectStore;
import org.design.factorydesign.example1.QueueService;

public class AzureFactory extends CloudFactory{
    @Override
    FileUploader getFileUploader() {
        return new AzureFileUploader();
    }

    @Override
    ObjectStore getObjectStore() {
        return null;
    }

    @Override
    QueueService getQueueService() {
        return null;
    }
}
