package ch.ghanmiali;

import java.util.Arrays;

public class StringArr {
    public static void main(String[] args) {

        String[] name = {"Peter", "Anna", "Ali", "Hans", "Dniella", "Anna", "F"};

/*
        int namelen = name.length;
        //int index = 0;
        System.out.print("SchulerZalen:   " + namelen);
        for (int i = 0; i < namelen; i++) {
            for (int j = i + 1; j < namelen; j++) {
                if (name[i].compareTo(name[j]) > 0) {
                    String temp = name[i];
                    name[i] = name[j];
                    name[j] = temp;
                }
            }
        }
        System.out.println("  \n" +
                "Name nach Alphabet: " + Arrays.toString(name) + "\n" +
                "Alphabetisch erste Name:" + name[0] + "\n" +
                "Alphabetisch Letzt Name:" + name[namelen - 1]);


 */

        String shortName = name[0];
    /*   for (int i = 0; i < name.length; ++i) {
        if  (name[i].compareTo(shortName)>0){
                shortName = name[i];
     */
        for (int i = 0; i < name.length; ++i) {
            if (name[i].length() < shortName.length()) {
                shortName = name[i];


            }
        }
        System.out.println("Kürzere Name:    " + shortName);
        String lengthName = name[0];
    /*   for (int i = 0; i < name.length; ++i) {
        if  (name[i].compareTo(shortName)>0){
                shortName = name[i];
     */
        for (int i = 0; i < name.length; ++i) {
            if ((name[i].length() > lengthName.length())) {
                lengthName = name[i];
            }
        }
        System.out.println("längste Name:    " + lengthName);


        int indexShort = 0;
        for (int i = 0; i < name.length; ++i) {
            if (name[i] == shortName) {
                indexShort = i;
            }
        }
        System.out.println("Short Name Position:    " + indexShort);

        int indexlang = 0;
        for (int i = 0; i < name.length; ++i) {
            if (name[i] == lengthName) {
                indexlang = i;
            }
        }
        System.out.println("Lang Name Position:    " + indexlang);


        String nameRepeat = name[0];
        for (int i = 0; i < name.length - 1; ++i) {
            for (int j = i + 1; j < name.length - 1; ++j) {
                if (name[i] == name[j]) {
                    nameRepeat = name[i];
                }
            }
        }
        System.out.println("Wiederholte name:  " + nameRepeat);


        int namelen = name.length;
//int index = 0;
        System.out.print("SchulerZalen:   " + namelen);
        for (int i = 0; i < namelen; i++) {
            for (int j = i + 1; j < namelen; j++) {
                if (name[i].compareTo(name[j]) > 0) {
                    String temp = name[i];
                    name[i] = name[j];
                    name[j] = temp;
                }
            }
        }
        System.out.println("  \n" +
                "Name nach Alphabet: " + Arrays.toString(name) + "\n" +
                "Alphabetisch erste Name:" + name[0] + "\n" +
                "Alphabetisch Letzt Name:" + name[namelen - 1]);

    }}

   /*

         int namenlänge =namelen[0].length;

                if (name[0]< name[1]) {
                    String temp = name[i];
                    name[i] = namelen[j];
                    name[j] = temp;
                    System.out.println("  \n" +
                            "Name nach länge: "+  Arrays.toString(name));

         */




