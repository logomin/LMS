package Lesson16String;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        String s1 = "first string";
        String s2 = new String("second string");
        char ch1[] = {'t', 'h', 'i', 'r', 'd', 't', 'h'};
        String s3 = new String(ch1);
        String s4 = new String("fourth".getBytes());
        StringBuilder stringBuilder = new StringBuilder("fifth");
        String s5 = new String(stringBuilder);

        String s6 = "Апельсин,Яблоко,Гранат,Груша";
        String s7[] = s6.split(",");
        String sBuf = "";
        for (String s : s7) {
            if (s.length() > sBuf.length())
                sBuf = s;
        }
        System.out.println(sBuf.toLowerCase());
        System.out.println(sBuf.substring(0, 3));
        //5
        System.out.println("5------------------------");
        String s10 = " Я_новая_строка ";
        System.out.println(s10);
        String s11 = s10.trim();
        String s12 = s11.replace('_', ' ');
        System.out.println(s12);
        //9
        System.out.println("9------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст");
        String s_input = scanner.nextLine();
        switch (s_input) {
            case "Запуск":
                System.out.println("Запускаем процесс"); break;
            case "завершен":
                System.out.println("Процесс завершен"); break;
            case "ошибка":
                System.out.println("Произошла ошибка"); break;
            default:
                System.out.println("Вы ввели: " + s_input);
        }

        System.out.println("StringBuilder-----------------------");

        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(s1 + s2 + s3 + "\n" + s4 + s5 + s6 + "\n" +
                s10 + s11 + s12 + "\n");
        stringBuilder1.reverse();
        System.out.println(stringBuilder1);
    }
}
