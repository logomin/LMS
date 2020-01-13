package Lesson17Enum;

import java.util.ArrayList;

public class Store {
    private String name;
    private String url;
    private ArrayList<User> users;
    private User authorizedUser;

    public boolean login(String name, String password) {
        boolean flag = false;
        for (User user : users) {
            if (user.getName().equals(name) && user.getPassword().equals(password)) {
                flag = true;
                this.setAuthorizedUser(user);
                break;
            }
        }
        return flag;
    }

    void getCurrentUserRights(User user) {
        switch (user.getRole()) {
            case DIRECTOR:
                System.out.println("Директор магазина, может управлять кадрами, и ценами"); break;
            case ADMINISTRATOR:
                System.out.println("Администратор магазина, может добавлять товары и редактировать их описание"); break;
            case MANAGER:
                System.out.println("Менеджер магазина, может общаться с клиентами"); break;
            case CLIENT:
                System.out.println("«Клиент магазина, может покупать товары и пользоваться дисконтом"); break;
            case ANONYMUS:
                System.out.println("Анонимный пользователь, может покупать товары и\\или авторизоваться"); break;
        }
    }

    public void logout(){
        this.authorizedUser = null;
        System.out.println("Пользователь вышел из системы");
    }

    public Store(String name, String url, ArrayList<User> users) {
        this.name = name;
        this.url = url;
        this.users = users;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setAuthorizedUser(User authorizedUser) {
        this.authorizedUser = authorizedUser;
    }

    public User getAuthorizedUser() {
        return authorizedUser;
    }
}
