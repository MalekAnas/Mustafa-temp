package com.black_lemon;

import java.util.ArrayList;

public class Tablet {

    private int id;
    private String manufacturer;
    private String model;
    private double priceValue;
    private int batteryLevel;
    private  ArrayList<String > notesWhenReturn = new ArrayList<>();
    private boolean borrowed;



    public Tablet(int id, String manufacturer, String model, double priceValue, int batteryLevel, ArrayList<String> notesWhenReturn, boolean borrowed) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.priceValue = priceValue;
        this.batteryLevel = batteryLevel;
        this.notesWhenReturn = notesWhenReturn;
        this.borrowed = borrowed;
    }










    //behavior
    private void addNewNote(String note){

        this.notesWhenReturn.add(note);
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPriceValue() {
        return priceValue;
    }

    public void setPriceValue(double priceValue) {
        this.priceValue = priceValue;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public ArrayList<String> getNotesWhenReturn() {
        return notesWhenReturn;
    }

    public void setNotesWhenReturn(ArrayList<String> notesWhenReturn) {
        this.notesWhenReturn = notesWhenReturn;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "id=" + id +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", priceValue=" + priceValue +
                ", batteryLevel=" + batteryLevel +
                ", notesWhenReturn=" + notesWhenReturn +
                '}';
    }
}

