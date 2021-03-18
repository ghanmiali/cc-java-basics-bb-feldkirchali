package ch.ghanmiali;

public class Main {

    public static void main(String[] args) {
        int calc = 0;   // Zwioschensumme
        for (int i = 1; i <= 100; ++i) {
            calc = calc + i;
            System.out.println("Schritt: " + i + " ZSumme: " + calc);


        }
    }
}
