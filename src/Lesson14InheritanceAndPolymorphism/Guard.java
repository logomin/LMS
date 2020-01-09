package Lesson14InheritanceAndPolymorphism;

public class Guard extends Employee {
    public void speakingRadio(){
        System.out.println("Говорю по рации");
    }

    @Override
    public void doingWork() {
        comeToWork();
        System.out.println("Делаю работу охранника");
        goToLunch();
        speakingRadio();
    }
}