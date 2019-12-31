package Lesson9Constructor;

public class Circle {
    double radius;
    double perimeter;
    double area;
    String color;

    public Circle(double radius) {
        this.radius = radius;
        this.perimeter = Math.PI * radius * 2;
        this.area = Math.PI * radius * radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.perimeter = Math.PI * radius * 2;
        this.area = Math.PI * radius * radius;
        this.color = color;
    }


}
