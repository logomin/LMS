package Lesson15Interfaces;

abstract class AbstractDevice {
    String name;
    Long serialNumber;
    abstract void powerOn();
    abstract void powerOff();

    public AbstractDevice() {
        powerOn();
    }
}
