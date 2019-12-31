package Lesson15Interfaces;

abstract class Appliance extends AbstractDevice {

    @Override
    void powerOn(){
        System.out.println("Power On");
    }

    @Override
    void powerOff(){
        System.out.println("Power Off");
    }
    abstract void cook();
}
