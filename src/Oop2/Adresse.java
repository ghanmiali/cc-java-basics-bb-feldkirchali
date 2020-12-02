package Oop2;

public class Adresse {
    private String street;
    private String hausNumber;
    private int postCode;
    private String location;
    private String country;

   public Adresse(String street, String hausNumber, int postCode, String location, String country) {
        this.street = street;
        this.hausNumber = hausNumber;
        this.postCode = postCode;
        this.location = location;
        this.country = country;

    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHausNumber() {
        return hausNumber;
    }

    public void setHausNumber(String hausNumber) {
        this.hausNumber = hausNumber;
    }

    public int getPostCode() {
        return postCode;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Adress :" + "\n" +
                "Strasse:  "+ street + "\n" +
                "hausNr :  "+ hausNumber + "\n" +
                "PLZ    :  "+ postCode + "\n" +
                "Ort    :  "+ location + "\n" +
                "Land   :  "+ country;
    }
}