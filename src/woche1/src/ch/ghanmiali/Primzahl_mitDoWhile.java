package ch.ghanmiali;

public class Primzahl_mitDoWhile {
    public static void main(String[] args) {
        int i = 1;
        do {
            i++;

            int j = 1;
            do {
                j++;

                System.out.println(i + "x" + j + "   =" + i * j);
            } while (j < 10);
        } while (i < 10);
    }
}

