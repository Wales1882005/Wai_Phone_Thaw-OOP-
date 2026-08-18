public class Main {
    public static void main(String[] args) {
        Refrigerator fridge = new Refrigerator("Samsung");
        fridge.displayBrand();
        fridge.turnOn();
        fridge.operate();
        fridge.turnOff();

        WashingMachine washer = new WashingMachine("LG");
        washer.displayBrand();
        washer.turnOn();
        washer.operate();
        washer.turnOff();
    }
}
