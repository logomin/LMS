package Lesson8Methods;

public class ShopCustomer {
    static final int MIN_AGE = 18;
    private String firstName;
    private String lastName;
    private String adress;
    private int zip;
    private int age;
    private String gender;

    public void toBucket(){
        System.out.println("Добавили товар в корзину");
    }

    public void lookBonus(){
        System.out.println("Просмотр списка боусов");
    }

    public void buy(){
        System.out.println("Покупаем товары");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
