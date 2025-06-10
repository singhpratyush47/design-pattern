package org.design.factorydesign.example1;

public class AzureFileUploader implements FileUploader{
    @Override
    public String upload() {
        return "Upload file to Azure file system";
    }
}
