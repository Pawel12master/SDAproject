package com.iot.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class MeteringValues {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private Timestamp timestamp;
    private double value;
    @OneToOne
    @JoinColumn(name="deviceID")
    private int deviceID;
    public MeteringValues() {
    }

    public MeteringValues(int ID, Timestamp timestamp, double value, int deviceID) {
        this.ID = ID;
        this.timestamp = timestamp;
        this.value = value;
        this.deviceID = deviceID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(int deviceID) {
        this.deviceID = deviceID;
    }
}
