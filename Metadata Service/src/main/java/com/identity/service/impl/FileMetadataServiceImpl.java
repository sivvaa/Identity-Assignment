package com.identity.service.impl;

import com.identity.model.FileInfo;
import com.identity.service.FileMetadataService;
import com.identity.utils.ConfigUtils;
import org.apache.commons.io.FilenameUtils;

import javax.activation.MimetypesFileTypeMap;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileMetadataServiceImpl implements FileMetadataService {

    public List<FileInfo> getMetaData() {
        List<FileInfo> fileInfoList = new ArrayList<FileInfo>();
        File[] files = new File(ConfigUtils.getConfiguredDirectory()).listFiles();
        for(File file : files) {
            FileInfo fileInfo = new FileInfo();
            fileInfo.setFileName(file.getName());
            fileInfo.setFileExtension(FilenameUtils.getExtension(file.getName()));
            fileInfo.setFileSize(file.length() + " Bytes");
            fileInfo.setMimeType(new MimetypesFileTypeMap().getContentType(file));
            fileInfoList.add(fileInfo);
        }
        return fileInfoList;
    }

    public List<String> getSupportedMimeTypes() {
        return Arrays.asList(ConfigUtils.getConfiguredMimeTypes().split(","));
    }

}
