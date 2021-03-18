package ch.ghanmiali;

public class wrapperklasseUnsSwitch {
    public static void main(String[] args) {

        int age = 35;
        if (age <= Byte.MAX_VALUE) {
            System.out.print("age in byte range");
        } else if (age <= Short.MAX_VALUE) {

            System.out.print("age in short range");

        } else if (age <= Long.MAX_VALUE) {

            System.out.print("age in long range");


        } else if (age <= Integer.MAX_VALUE) {

        }
        System.out.print("  age in int range");





    }
}

