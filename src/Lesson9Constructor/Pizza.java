package Lesson9Constructor;

/**
 * Класс пицца.
 */

public class Pizza {
    Circle basis; // основа
    String[] composition; // состав пиццы
    String name; // название пиццы
    Float cost; // цена

    public Pizza(String name, String[] composition, Float cost, Double diameter) {
        this.composition = composition;
        this.name = name;
        this.cost = cost;
        this.basis = new Circle(diameter/2);
    }
}
