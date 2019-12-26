package Lesson12Packages.packages.test;

import Lesson12Packages.packages.citizen.Passport;
import static Lesson12Packages.packages.citizen.PassportUtil.*;

public class CitizenMain {
    public static void main(String[] args) {
        Passport citizenPass1 = new Passport();
        Passport citizenPass2 = new Passport();
        citizenPass1.Id = 1_111_111_111;
        citizenPass2.Id = 2_222_222_222L;
        System.out.println("ID первого гражданина(-ки) --- " + citizenPass1.Id);
        System.out.println("ID второго гражданина(-ки) --- " + citizenPass2.Id);
        marriageRegistrate(citizenPass1,citizenPass2);
        System.out.println("ID супрруга(-и) первого гражданина(-ки) --- " + citizenPass1.spouseId);
        System.out.println("ID супрруга(-и) второго гражданина(-ки) --- " + citizenPass2.spouseId);
    }
}
