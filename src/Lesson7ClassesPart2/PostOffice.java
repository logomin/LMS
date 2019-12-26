package Lesson7ClassesPart2;

public class PostOffice {
    static final String SETTLEMENT_ACCOUNT = "01258414";
    private String adressLine1;
    private String adressLine2;
    private int zip;
    private boolean status;
    private char type;

    public String getAdressLine1() {
        return adressLine1;
    }

    public void setAdressLine1(String adressLine1) {
        this.adressLine1 = adressLine1;
    }

    public String getAdressLine2() {
        return adressLine2;
    }

    public void setAdressLine2(String adressLine2) {
        this.adressLine2 = adressLine2;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }
}
