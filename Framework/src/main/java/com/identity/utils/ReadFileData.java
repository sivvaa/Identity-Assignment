package com.identity.utils;

import com.identity.model.Vehicle;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFileData {

    public static Vehicle getVehicleData(String fileName) {
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
