package Lesson15Interfaces;

public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();
        Dialphone dialphone = new Dialphone();
        Multicooker multicooker = new Multicooker();
        Oven oven = new Oven();

        smartphone.runApp();
        smartphone.call();
        dialphone.call();
        multicooker.cook();
        //oven.powerOff();
        PowerOffAll(oven, dialphone, smartphone);

    }

    public static void PowerOffAll(AbstractDevice ... devices){
        for (AbstractDevice device: devices) {
            device.powerOff();
        }
    }

}
