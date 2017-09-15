package com.identity.service;

import com.identity.model.FileInfo;

import java.util.List;

/**
 * Interface to define the methods for file service
 */
public interface FileMetadataService {
    public List<FileInfo> getMetaData();
    public List<String> getSupportedMimeTypes();
}
