package Oop2;

import ghanmi.com.OOP_CampusOrganisation.Adress;

import javax.swing.*;
import java.util.Arrays;

public class Oop2Main {
    public static void main(String[] args) {
/*

        PersonnenAngaben student1 = new PersonnenAngaben("Hans", "petersan", "beginner",
                "417625001", "test.test@gmail.com");
        Adresse adresse2 = new Adresse("hofstrasse", "182", 9999, "SG", "Schweiz");

        PersonnenAngaben student2 = new PersonnenAngaben("Peter", "Hofmann", "beginner",
                "417000000", "test2.test@gmail.com" + adresse2);

        PersonnenAngaben trainer01 = new PersonnenAngaben("Daniel", "Lee", "Sofwear Developer Senior",
                "417625001", "lee.test@gmail.com");
    //setfunktion
        PersonnenAngaben student3 = new PersonnenAngaben();
        PersonnenAngaben student4 = new PersonnenAngaben();

        student3.setFirstName("add");
        student3.setLastName("bbbbb");
        student3.setRequiredKnowledge_Qualification("keine");
        student3.setPhoneNum("ad");
        student3.setMail("test@gmail.com");
        // student3.getAdresse();????

        var adresse = student4.getAdresse();


        System.out.println("student 1 Angaben \n" + student1);
        System.out.println("************************");
        System.out.println("student 2 Angaben \n" + student2);
        System.out.println("************************");
        System.out.println("Trainer  \n" + trainer01);
        System.out.println("************************");
        PrintParticipant(student1);
        System.out.println("************************");
        System.out.println("student 3 Angaben \n"+student3);
    }

    public static void PrintParticipant(PersonnenAngaben PersonnenAngaben) {
        System.out.printf("%-15s %-10s", PersonnenAngaben.getFirstName(), PersonnenAngaben.getLastName()+"\n");
    }
}
*/
        //gewünschte anzal eingeben
        //ong anzal = Integer.parseInt(JOptionPane.showInputDialog("Stundente anzal eingen"));
        PersonnenAngaben[] att = PersonnenErfasse(1);

        int menberNum = 1000;
        for (int i = 0; i < att.length; i+=5) {
            menberNum++;
            // System.out.println(tostring(att[i]) + "\n" + "Member Num:" + menberNum);
        }
            System.out.println(Arrays.toString(att));

        }


    public static PersonnenAngaben PersonnenErfasse() {


        String firstName = ((JOptionPane.showInputDialog("bitte Vorname eingeben")));
        String lastName = ((JOptionPane.showInputDialog("bitte Nachname eingeben")));
        String requiredKnowledge_Qualification = ((JOptionPane.showInputDialog("bitte Vorkentniss oder Qualifikation eingeben")));
        String phoneNum = String.valueOf(Integer.parseInt((JOptionPane.showInputDialog("bitte Telefon numern eingeben"))));
        String mail = ((JOptionPane.showInputDialog("bitte Mail eingeben")));
        String street = ((JOptionPane.showInputDialog("bitte strasse eingeben")));
        String hausNum = ((JOptionPane.showInputDialog("bitte strasse eingeben")));
        //String street = ((JOptionPane.showInputDialog("bitte strasse eingeben")));
       // String street = ((JOptionPane.showInputDialog("bitte strasse eingeben")));

        //daten erzeugen und zurückgeben
        return new PersonnenAngaben(firstName, lastName, requiredKnowledge_Qualification, phoneNum, mail);


    }

    public static PersonnenAngaben[] PersonnenErfasse(int n) {

        PersonnenAngaben[] att = new PersonnenAngaben[n];
        for (int i = 0; i < att.length; i++) {
            att[i] = PersonnenErfasse();
        }
        return att;
    }

    public static String tostring(PersonnenAngaben att) {
        String liste = "vorname: " + att.getFirstName() + "\n" + "Nachname: " + att.getLastName() + "\n" + "Qualifikation: " + att.getRequiredKnowledge_Qualification() + "\n" +
                "telefon: " + att.getPhoneNum() + "\n" +
                "Mail: " + att.getMail() + "  ";

        return liste;
    }
}

