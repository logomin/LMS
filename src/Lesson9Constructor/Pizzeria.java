package Lesson9Constructor;

/**
 * Класс Пицерия. Он делает пиццы.
 */

import java.util.ArrayList;

public class Pizzeria {
    public static void main(String[] args) {
        ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
        pizzas.add(new Pizza("carbonara", new String[] {"bacon", "mushrooms", "garlic", "mozzarella cheese"},150f,80d));
        pizzas.add(new Pizza("carbonara", new String[] {"bacon", "mushrooms", "garlic", "mozzarella cheese"},150f,80d));
        pizzas.add(new Pizza("carbonara", new String[] {"bacon", "mushrooms", "garlic", "mozzarella cheese"},150f,80d));
        pizzas.add(new Pizza("carbonara", new String[] {"bacon", "mushrooms", "garlic", "mozzarella cheese"},150f,80d));
        pizzas.add(new Pizza("carbonara", new String[] {"bacon", "mushrooms", "garlic", "mozzarella cheese"},150f,80d));

        for (Pizza pizza:pizzas) {
            System.out.print("Название пиццы --- " + pizza.name);
            System.out.print(". Состав пиццы --- ");
            for (String s:pizza.composition) {
                System.out.print(s + ", ");
            }
            System.out.print("\b\b. Цена пиццы --- " + pizza.cost);
            System.out.println(". Диаметр пиццы --- " + pizza.basis.radius*2);
        }

    }
}
