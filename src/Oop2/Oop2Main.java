package Oop2;

import javax.swing.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Oop2Main {
    public static void main(String[] args) {

        PersonnenAngaben[] att = PersonnenErfasse(1);
        Set<PersonnenAngaben> s = new HashSet<>();
        int menberNum = 1000;
        for (int i = 0; i < att.length; i+=5) {
            menberNum++;
            s.add(att[i]);
            }
            System.out.println((s));

        }


    public static PersonnenAngaben PersonnenErfasse() {


        String firstName = ((JOptionPane.showInputDialog("bitte Vorname eingeben")));
        String lastName = ((JOptionPane.showInputDialog("bitte Nachname eingeben")));
        String requiredKnowledge_Qualification = ((JOptionPane.showInputDialog("bitte Vorkentniss oder Qualifikation eingeben")));
        String phoneNum = String.valueOf(Integer.parseInt((JOptionPane.showInputDialog("bitte Telefon numern eingeben"))));
        String mail = ((JOptionPane.showInputDialog("bitte Mail eingeben")));
        String street = ((JOptionPane.showInputDialog("bitte strasse eingeben")));
        String HausNumber = ((JOptionPane.showInputDialog("bitte Haus Nr. eingeben")));
        int postCode = Integer.parseInt((JOptionPane.showInputDialog("bitte PLZ eingeben")));
        String location = ((JOptionPane.showInputDialog("bitte Ortschaft eingeben")));
        String country = ((JOptionPane.showInputDialog("bitte Land eingeben")));

        //daten erzeugen und zurückgeben
        return new PersonnenAngaben(firstName, lastName, requiredKnowledge_Qualification, phoneNum, mail,street,HausNumber,postCode,location,country);


    }

    public static PersonnenAngaben[] PersonnenErfasse(int n) {

        PersonnenAngaben[] att = new PersonnenAngaben[n];
        for (int i = 0; i < att.length; i++) {
            att[i] = PersonnenErfasse();
        }
        return att;
    }

    public static String tostring(PersonnenAngaben att ) {
        String liste = "vorname: " + att.getFirstName() + "\n" + "Nachname: " + att.getLastName() + "\n" + "Qualifikation: " + att.getRequiredKnowledge_Qualification() + "\n" +
                "telefon: " + att.getPhoneNum() + "\n" +
                "Mail: " + att.getMail();

        return liste;
    }
}

