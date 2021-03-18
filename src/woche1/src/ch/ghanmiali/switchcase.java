package ch.ghanmiali;

public class switchcase {
    public static void main(String[] args) {
        int note = 6;
        switch (note) {
            case 1:
                System.out.println("was sollen wir mit dir machen?");
                break;
            case 2:
                System.out.println("Sehr Schwach,zurück in die kindergarten");
                break;
            case 3:
                System.out.println("Schwach,ungenügend");
                break;
            case 4:
                System.out.println("genügend ");
                break;
            case 5:
                System.out.println("gut+");
                break;
            case 6:
                System.out.println("Sehr Gut");
                break;
        }
        String notenBewertung = "was sollen wir mit dir Machen?";


        switch (notenBewertung) {
            case "was sollen wir mit dir machen?","WAS SOLLEN WIR MIT DIR MACHEN":note=1;

                System.out.println(note);
                break;

            case "Sehr Schwach,zurück in die kindergarten", "SEHR SCHWACH":note=2;
                System.out.println(note);
                break;

            case "Schwach,ungenügend","SCHWACH UNGENÜGEND": note =3;
                System.out.println(note);
                break;

            case "genügend","GENÜGEND": note =4;
                System.out.println(note);
                break;

            case "gut+", "GUT+":note =5;
            System.out.println(note);
                break;

            case "Sehr gut","SEHR GUT":note = 6;
                System.out.println(note);
                break;

        }
    }

}