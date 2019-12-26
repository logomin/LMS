package Lesson12Packages.packages.citizen;

public class PassportUtil {
    private PassportUtil() {
        //Закрытый конструктор
    }

    public static void marriageRegistrate(Passport passport1, Passport passport2){
        passport1.spouseId = passport2.Id;
        passport2.spouseId = passport1.Id;
    }
}
