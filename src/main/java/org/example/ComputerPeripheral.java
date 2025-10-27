package org.example;

abstract class ComputerPeripheral {
    protected String brand;
    protected String model;
    protected double price;

    public ComputerPeripheral() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.price = 0.0;
    }

    public ComputerPeripheral(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public abstract void connect();
    public abstract void disconnect();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }

    public void displayInfo(boolean showPrice) {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        if (showPrice) {
            System.out.println("Price: $" + price);
        }
    }
}