package ch.ghanmiali;

import java.util.Arrays;

public class functions {

    public static void main(String[] args) {
        String[] name = {"Peter", "Anna", "Ali", "Hans", "Dniella", "Anna", "F"};
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < name.length - 1; i++) {
                if (name[i].compareTo(name[i + 1]) > 0) {
                    swapped = true;
                    String temp = name[i];
                    name[i] = name[i + 1];
                    name[i + 1] = temp;
                }


            }
        }
        System.out.println(Arrays.toString(name));
    }
}
    /*

    public static String[] nameSort(String[] name) {
        String[] nameCopy = Arrays.copyOf(name, name.length);

        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < name.length - 1; i++) {
                if (name[i].compareTo(name[i + 1]) > 0) {
                    swapped = true;
                    String temp = name[i];
                    name[i] = name[i + 1];
                    name[i + 1] = temp;
                }
            }
        }
        return nameCopy;
    }
}

     */