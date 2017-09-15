package com.identity.model;

/**
 * Model to hold the details of the vehicle from CSV / Excel sheet
 */
public class Vehicle {

    private String registrationNumber;
    private String make;
    private String color;

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "registrationNumber='" + registrationNumber + '\'' +
                ", make='" + make + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
