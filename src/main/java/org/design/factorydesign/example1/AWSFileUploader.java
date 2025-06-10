package org.design.factorydesign.example1;

public class AWSFileUploader implements FileUploader{
    @Override
    public String upload() {
        return "Upload file to AWS s3 or EFS";
    }
}
