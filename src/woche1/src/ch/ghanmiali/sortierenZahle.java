package ch.ghanmiali;

public class sortierenZahle {
    public static int[] sortierenZahle(int[] sort) {
        for (int i = 0; i < sort.length -1; i++) {
            for (int j = i + 1; j < sort.length; j++) {
                if (sort[j] < sort[i]) {
                    int speicher = sort[i];
                    sort[i] = sort[j];
                    sort[j] = speicher;
             //       counter += 1;

                 //   int counter = 0;


                }
            }
        }

        return sort;
    }

    public static void main(String[] args) {

        int[] zahlen = {1, 2, -5, 3, 10, -2, -1, -3, 0, 3, 6, 7};
        System.out.println("zahlenunsortiert: ");
        for (int i = 0; i < zahlen.length; i++) {
            System.out.print(zahlen[i] + "  , ");
        }
        System.out.println();

        int[] zahlenbis = sortierenZahle(zahlen);

        System.out.println("zahlensortiert: ");
        for (int i = 0; i < zahlenbis.length; i++) {
            System.out.print(zahlenbis[i] + "  ");//zweit höchst oder kleinste zahl

        }
        System.out.println();

        System.out.println(zahlen[1]);
    }
}
