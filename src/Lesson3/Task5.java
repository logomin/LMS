package Lesson3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Введите число от " + Integer.MIN_VALUE + " до " + Integer.MAX_VALUE);
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int i = Integer.parseInt(s);
        s = ((i % 2 == 0) ? "четное" : "нечетное");
        System.out.println(s);
    }
}
