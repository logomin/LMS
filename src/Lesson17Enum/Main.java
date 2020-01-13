package Lesson17Enum;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("first user", "1111", "first user", Position.DIRECTOR));
        users.add(new User("second user", "1111", "second user", Position.ADMINISTRATOR));
        users.add(new User("third user", "1111", "third user", Position.MANAGER));
        users.add(new User("fourth user", "1111", "fourth user", Position.CLIENT));
        users.add(new User("fifth user", "1111", "fifth user", Position.ANONYMUS));

        Store store = new Store("store", "https://...", users);
        while (true) {
            tryLogin(store);
        }
    }

    public static void tryLogin(Store store) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин:");
        String login = scanner.nextLine();
        System.out.println("Введите пароль:");
        String password = scanner.nextLine();
        if (store.login(login, password)) {
            store.getCurrentUserRights(store.getAuthorizedUser());
            store.logout();
        } else {
            System.out.println("Неверный логин и\\или пароль»");
        }
    }
}
