package com.iot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int deviceID;
    private String name;
    private String model;
    private String producent;
    private double rangeofTemperature;
    private double rangeofMeasurement;
    private double currentMeasure;

    public Device(int deviceID, String name, String model, String producent, double rangeofTemperature, double rangeofMeasurement, double currentMeasure) {
        this.deviceID = deviceID;
        this.name = name;
        this.model = model;
        this.producent = producent;
        this.rangeofTemperature = rangeofTemperature;
        this.rangeofMeasurement = rangeofMeasurement;
        this.currentMeasure = currentMeasure;
    }
    public Device(){}

    public int getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(int deviceID) {
        this.deviceID = deviceID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public double getRangeofTemperature() {
        return rangeofTemperature;
    }

    public void setRangeofTemperature(double rangeofTemperature) {
        this.rangeofTemperature = rangeofTemperature;
    }

    public double getRangeofMeasurement() {
        return rangeofMeasurement;
    }

    public void setRangeofMeasurement(double rangeofMeasurement) {
        this.rangeofMeasurement = rangeofMeasurement;
    }

    public double getCurrentMeasure() {
        return currentMeasure;
    }

    public void setCurrentMeasure(double currentMeasure) {
        this.currentMeasure = currentMeasure;
    }
}
