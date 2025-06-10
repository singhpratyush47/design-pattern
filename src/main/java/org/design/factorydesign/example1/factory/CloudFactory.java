package org.design.factorydesign.example1.factory;

import org.design.factorydesign.example1.FileUploader;
import org.design.factorydesign.example1.ObjectStore;
import org.design.factorydesign.example1.QueueService;

public abstract class CloudFactory {

    abstract FileUploader getFileUploader();
    abstract ObjectStore getObjectStore();
    abstract QueueService getQueueService();

    public String uploadFile(){
        FileUploader fileUploader = getFileUploader();
        return fileUploader.upload();
    }
}
