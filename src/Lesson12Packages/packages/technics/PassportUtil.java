package Lesson12Packages.packages.technics;

import java.util.Date;

public class PassportUtil {
    private PassportUtil() {
        //Закрытый конструктор
    }

    public static void warrantyReplace(Passport passport){
        passport.warrantyStartDate = new Date();
    }
}
