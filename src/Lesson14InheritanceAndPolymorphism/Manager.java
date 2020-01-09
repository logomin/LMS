package Lesson14InheritanceAndPolymorphism;

public class Manager extends Employee {
    private String department;

    public void consult(){
        System.out.println("Консультирую");
    }

    public void tellAboutDiscount(){
        System.out.println("Расказываю про скидки");
    }

    public void advise(){
        System.out.println("Советую");
    }

    @Override
    public void doingWork() {
        System.out.println("Делаю работу менеджера");;
    }
}
