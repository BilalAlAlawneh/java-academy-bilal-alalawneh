package com.pluralsight;

public class Vehicle {
    private Long vehicleID;
    private String makeModel;
    private String color;
    private int odometerReading;
    private float price;

    public Vehicle(long vehicleID, String makeModel, String color, int odometerReading, float price){
        this.vehicleID = vehicleID;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;
    }
    public Vehicle(Vehicle other) {
        this.vehicleID = other.getVehicleID();
        this.makeModel = other.getMakeModel();
        this.color = other.getColor();
        this.odometerReading = other.getOdometerReading();
        this.price = other.getPrice();
    }

    public long getVehicleID(){
        return vehicleID;
    }

    public void setVehicleID(long vehicleID){
         this.vehicleID = vehicleID;
    }

    public String getMakeModel(){
        return makeModel;
    }

    public void setMakeModel(String makeModel){
        this.makeModel = makeModel;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public int getOdometerReading(){
        return odometerReading;
    }

    public void setOdometerReading(int odometerReading){
         this.odometerReading = odometerReading;
    }

    public float getPrice(){
        return price;
    }

    public void setPrice(float price){
        this.price = price;
    }

}
