package Lesson9Constructor;

/**
   Класс создает окружность. Возможно создавать окружность двумя способами.
 Используя в качестве параметра радиус, или радиус и цвет.

 */

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(15, "red");
        System.out.printf("Длина окружности = %.2f", circle.perimeter);
        System.out.printf(". Площадь окружности = %.2f", circle.area);
        System.out.println(". Цвет --- " + circle.color);
    }
}
