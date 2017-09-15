package com.identity.client;


import com.identity.service.FileMetadataService;
import com.identity.service.impl.FileMetadataServiceImpl;

/**
 * Client to call the Service methods.
 */
public class ServiceClient {

    public static void main(String[] args) {
        FileMetadataService service = new FileMetadataServiceImpl();
        System.out.println(service.getMetaData());
        System.out.println(service.getSupportedMimeTypes());
    }
}
