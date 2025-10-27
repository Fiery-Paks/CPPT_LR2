package org.example;

class Keyboard extends ComputerPeripheral {
    private int keyCount;
    private boolean mechanical;
    private String switchType;
    private static int keyboardCount = 0; // Статический счетчик

    public Keyboard() {
        super();
        this.keyCount = 104;
        this.mechanical = false;
        this.switchType = "Membrane";
        keyboardCount++;
    }

    public Keyboard(String brand, String model, double price, int keyCount, boolean mechanical, String switchType) {
        super(brand, model, price);
        this.keyCount = keyCount;
        this.mechanical = mechanical;
        this.switchType = switchType;
        keyboardCount++;
    }

    @Override
    public void connect() {
        System.out.println("Keyboard " + brand + " " + model + " connected via USB");
    }

    @Override
    public void disconnect() {
        System.out.println("Keyboard " + brand + " " + model + " disconnected");
    }

    public void typeText(String text) {
        System.out.println("Typing: " + text);
    }

    public void toggleBacklight() {
        System.out.println("Keyboard backlight toggled");
    }

    public int getKeyCount() {
        return keyCount;
    }

    public void setKeyCount(int keyCount) {
        this.keyCount = keyCount;
    }

    public boolean isMechanical() {
        return mechanical;
    }

    public void setMechanical(boolean mechanical) {
        this.mechanical = mechanical;
    }

    public String getSwitchType() {
        return switchType;
    }

    public void setSwitchType(String switchType) {
        this.switchType = switchType;
    }

    // Статический метод для возвращения значения счетчика
    public static int getKeyboardCount() {
        return keyboardCount;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Key Count: " + keyCount);
        System.out.println("Mechanical: " + mechanical);
        System.out.println("Switch Type: " + switchType);
    }
}
