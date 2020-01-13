package Lesson17Enum;

public class User {
    private String login;
    private String password;
    private String name;
    private Position role = Position.ANONYMUS;

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public Position getRole() {
        return role;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(Position role) {
        this.role = role;
    }

    public User() {
    }

    public User(String login, String password, String name, Position role) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.role = role;
    }
}

