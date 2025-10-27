package org.example;

class GraphicsTablet extends ComputerPeripheral {
    private int pressureLevels;
    private double activeArea;
    private boolean hasScreen;

    public GraphicsTablet() {
        super();
        this.pressureLevels = 2048;
        this.activeArea = 8.0;
        this.hasScreen = false;
    }

    public GraphicsTablet(String brand, String model, double price, int pressureLevels, double activeArea, boolean hasScreen) {
        super(brand, model, price);
        this.pressureLevels = pressureLevels;
        this.activeArea = activeArea;
        this.hasScreen = hasScreen;
    }

    @Override
    public void connect() {
        System.out.println("Graphics tablet " + brand + " " + model + " connected via USB");
    }

    @Override
    public void disconnect() {
        System.out.println("Graphics tablet " + brand + " " + model + " disconnected");
    }

    public void draw() {
        System.out.println("Drawing on graphics tablet");
    }

    public void calibrate() {
        System.out.println("Calibrating graphics tablet");
    }

    public int getPressureLevels() {
        return pressureLevels;
    }

    public void setPressureLevels(int pressureLevels) {
        this.pressureLevels = pressureLevels;
    }

    public double getActiveArea() {
        return activeArea;
    }

    public void setActiveArea(double activeArea) {
        this.activeArea = activeArea;
    }

    public boolean hasScreen() {
        return hasScreen;
    }

    public void setHasScreen(boolean hasScreen) {
        this.hasScreen = hasScreen;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Pressure Levels: " + pressureLevels);
        System.out.println("Active Area: " + activeArea + " inches");
        System.out.println("Has Screen: " + hasScreen);
    }
}
