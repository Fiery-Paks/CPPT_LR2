package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Keyboard keyboard = new Keyboard();
        keyboard = new Keyboard("Logitech", "G Pro", 129.99, 87, true, "Blue");
        keyboard.displayInfo();
        System.out.println("\n");

        keyboard.connect();
        keyboard.typeText("Some Text");
        keyboard.toggleBacklight();
        keyboard.displayInfo();
        System.out.println("\n");

        Headphones headphones = new Headphones();
        headphones = new Headphones("Sony", "WH-1000XM4", 349.99, true, true, 32);
        headphones.displayInfo();
        System.out.println("\n");

        headphones.connect();
        headphones.playAudio();
        headphones.adjustVolume(80);
        headphones.displayInfo();
        System.out.println("\n");

        GraphicsTablet tablet = new GraphicsTablet("Wacom", "Intuos Pro", 399.99, 8192, 10.0, false);
        tablet.displayInfo();
        System.out.println("\n");

        tablet.connect();
        tablet.draw();
        tablet.calibrate();
        tablet.displayInfo();
        System.out.println("\n");

        // Демонстрация статического счетчика
        System.out.println("\nСтатический счетчик созданных клавиатур:+" +
                            "Создано клавиатур: " + Keyboard.getKeyboardCount()+"\n");

        System.out.println("\nСоздаем дополнительные клавиатуры...");
        Keyboard keyboard2 = new Keyboard("Razer", "BlackWidow", 159.99, 104, true, "Green");
        Keyboard keyboard3 = new Keyboard();

        System.out.println("Теперь создано клавиатур: " + Keyboard.getKeyboardCount());
    }
}







