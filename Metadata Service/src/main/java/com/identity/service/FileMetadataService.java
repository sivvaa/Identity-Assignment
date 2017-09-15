package com.identity.service;

import com.identity.model.FileInfo;

import java.util.List;

public interface FileMetadataService {
    public List<FileInfo> getMetaData();
    public List<String> getSupportedMimeTypes();
}
