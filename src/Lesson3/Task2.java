package Lesson3;

public class Task2 {
    public static void main(String[] args) {
        byte b = 50;
        short sh = b;
        int i1 = sh;
        long l = i1;
        double d1 = i1;
        float fl = sh;
        double d2 = fl;
        char ch = 'a';
        int i2 = ch;
        System.out.println("byte = " + b + " -> short = " + sh + " -> int = " + i1 + " -> long = " + l);
        System.out.println("int = " + i1 + " -> double = " + d1);
        System.out.println("short = " + sh + " -> float = " + fl + " -> double = " + d2);
        System.out.println("char = " + ch + " -> int = " + i2);
    }
}
