package org.example;

class Headphones extends ComputerPeripheral {
    private boolean wireless;
    private boolean noiseCancelling;
    private int impedance;

    public Headphones() {
        super();
        this.wireless = false;
        this.noiseCancelling = false;
        this.impedance = 32;
    }

    public Headphones(String brand, String model, double price, boolean wireless, boolean noiseCancelling, int impedance) {
        super(brand, model, price);
        this.wireless = wireless;
        this.noiseCancelling = noiseCancelling;
        this.impedance = impedance;
    }

    @Override
    public void connect() {
        if (wireless) {
            System.out.println("Wireless headphones " + brand + " " + model + " connected via Bluetooth");
        } else {
            System.out.println("Wired headphones " + brand + " " + model + " connected via 3.5mm jack");
        }
    }

    @Override
    public void disconnect() {
        System.out.println("Headphones " + brand + " " + model + " disconnected");
    }

    public void playAudio() {
        System.out.println("Playing audio through headphones");
    }

    public void adjustVolume(int level) {
        System.out.println("Volume adjusted to level: " + level);
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    public boolean isNoiseCancelling() {
        return noiseCancelling;
    }

    public void setNoiseCancelling(boolean noiseCancelling) {
        this.noiseCancelling = noiseCancelling;
    }

    public int getImpedance() {
        return impedance;
    }

    public void setImpedance(int impedance) {
        this.impedance = impedance;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Wireless: " + wireless);
        System.out.println("Noise Cancelling: " + noiseCancelling);
        System.out.println("Impedance: " + impedance + " ohms");
    }
}
