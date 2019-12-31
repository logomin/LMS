package Lesson15Interfaces;

public class Oven extends Appliance{
    void initTimer(int timer){
        System.out.println("Начальное значение таймера --- " + timer + " минут");
    }

    @Override
    void cook(){
        System.out.println("Готовим еду");
    }
}
