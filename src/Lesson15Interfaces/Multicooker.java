package Lesson15Interfaces;

class Multicooker extends Appliance {

    void switchProgramm(int program){
        System.out.println("Выбираем программу с номером " + program);
    }

    @Override
    void cook(){
        System.out.println("Готовим еду");
    }
}
