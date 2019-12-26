package Lesson12Packages.packages.transport;

public class PassportUtil {
    private PassportUtil() {
        //Закрытый конструктор
    }

    static Passport changeOwner(Passport passport, String newOwnerName){
        Passport newPassport = new Passport();
        newPassport.model = passport.model;
        newPassport.price = passport.price;
        newPassport.year = passport.year;
        newPassport.ownerName =newOwnerName;
        return newPassport;
    }
}
