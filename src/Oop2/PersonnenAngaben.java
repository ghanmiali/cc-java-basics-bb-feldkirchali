package Oop2;

import com.sun.jdi.InvalidTypeException;
import ghanmi.com.OOP_CampusOrganisation.Adress;

import javax.swing.*;
import java.util.IllegalFormatException;
import java.util.InputMismatchException;
import java.util.regex.Pattern;

public class PersonnenAngaben {
    public String firstName;
    private String lastName;
    private String requiredKnowledge_Qualification;
    private String phoneNum;
    private String mail;
    Adresse adress;
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private static final Pattern nam_ort_pat = Pattern.compile("^[a-zA-Z \\-]+$");
    private static final Pattern str_pat     = Pattern.compile("^[a-zA-Z]+ \\d+$");
    private static final Pattern plz_pat     = Pattern.compile("^\\d{5}$");
    private static final Pattern geb_pat     = Pattern.compile("^\\d{2}\\.\\d{2}\\.\\d{4}$");

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    Adresse adresse;

    PersonnenAngaben(String firstName, String lastName, String requiredKnowledge_Qualification, String phoneNum, String mail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.requiredKnowledge_Qualification = requiredKnowledge_Qualification;
        this.phoneNum = phoneNum;
        this.mail = mail;
    }


    PersonnenAngaben(String firstName, String lastName, String requiredKnowledge_Qualification, String phoneNum,
                     String mail, String street, String HausNumber, int postCode, String location, String Country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.requiredKnowledge_Qualification = requiredKnowledge_Qualification;
        this.phoneNum = phoneNum;
        this.mail = mail;
        this.adress = new Adresse(street, HausNumber, postCode, location, Country);

    }


    PersonnenAngaben(String firstName, String lastName, String requiredKnowledge_qualification,
                     String phoneNum, String mail, Adresse adress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.requiredKnowledge_Qualification = requiredKnowledge_qualification;
        this.phoneNum = phoneNum;
        this.mail = mail;
        this.adress = adress;

    }

    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        if (!nam_ort_pat.matcher(firstName).find()) {
            throw new IllegalArgumentException(firstName);
    }
            this.firstName = firstName;

    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {

        if (!nam_ort_pat.matcher(lastName).find()) {
            throw new IllegalArgumentException(lastName);
    }
                this.lastName = lastName;
            }

    public String getRequiredKnowledge_Qualification() {
        return requiredKnowledge_Qualification;
    }

    public void setRequiredKnowledge_Qualification(String requiredKnowledge_Qualification) {
        if (!nam_ort_pat.matcher(requiredKnowledge_Qualification).find()) {
            throw new IllegalArgumentException(requiredKnowledge_Qualification);
        }
        this.requiredKnowledge_Qualification = requiredKnowledge_Qualification;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
            }


    public String getMail() {
        return mail;
    }

    public void setMail(String mail)
    {
        this.mail = mail;
    }


    public PersonnenAngaben() {

    }
    public void setAdress(String street, String hausNum, int postcode, String city, String country) {
        this.adress = new Adresse(street, hausNum, postcode, city, country);
    }
    // @Override
    public String toString() {
        return ("Vorname    : " + firstName + "\n"+
                "Nachname   : " + lastName + "\n" +
                "Level:     : " + requiredKnowledge_Qualification + "\n" +
                "Tel        : " + phoneNum + "\n" +
                "Mail       : " + mail+"\n"+adress);
    }
}


