package com.identity.utils;

import com.identity.model.Vehicle;
import org.apache.commons.io.FilenameUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

/**
 * Class to read Excel data
 */
public class ReadFileData {

    /**
     * Method to read excel data and model the data in to a Vehicle object
     * @param fileName
     * @return
     */
    public static Vehicle getVehicleData(String fileName) {

        if(!FilenameUtils.getExtension(fileName).equals("xlsx")) {
            throw new RuntimeException("The data file id not a supported file type");
        }

        Vehicle vehicle = new Vehicle();
        try {
            FileInputStream fis = new FileInputStream(ConfigUtils.getConfiguredDirectory()+"/"+fileName);

            XSSFWorkbook wb = new XSSFWorkbook(fis);
            XSSFSheet sheet = wb.getSheetAt(0);

            vehicle.setRegistrationNumber(sheet.getRow(0).getCell(0).getStringCellValue());
            vehicle.setMake(sheet.getRow(0).getCell(1).getStringCellValue());
            vehicle.setColor(sheet.getRow(0).getCell(2).getStringCellValue());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return vehicle;
    }
}
