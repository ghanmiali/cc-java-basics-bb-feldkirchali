package ch.ghanmiali;

public class linear_arrays {

    /* public static void main(String[] args) {
         int[] businessResult = {1, 2, -5, 3, 10, -2, -1, -3, 0, 3, 6, 7};
         int summe = 0;
         for (int i = 0; i < businessResult.length - 1; i++) {
             summe += businessResult[i];
         }
         System.out.print("GesamteResunlt   " + summe);
     }
 */
    /*
    //Die Maximale wert
    public static void main(String[] args) {
        int[] businessResult = {1, 2, -5, 3, 10, -2, -1, -3, 0, 3, 6, 7};
        int max = businessResult[0];

        for (int i = 0; i < businessResult.length ; i++) {
            if (businessResult[i] >max) {
                max = businessResult[i];
            }
        }
        System.out.println("Die Maximale wert: " + max);
    }

}
*/

    //Die Minimals wert
    public static void main(String[] args) {
        int[] businessResult = {10, 20, -5, 3, 1, -2, -1, -3, 0, 3, 6, 7};

        int summe = 0;
        for (int s = 0; s < businessResult.length; s++) {
            summe += businessResult[s];
        }


        int min = businessResult[0];
        int max = businessResult[0];
        // int moIndex = 0;

        for (int i = 0; i < businessResult.length; i++) {
           // for (int k = 0; k < businessResult.length; k++) {//Monatesumsatz
                if (businessResult[i] == min) {
                    min = businessResult[i];
                }
                if (businessResult[i] == max) {
                    max = businessResult[i];
                }

                for (int j = 0; j < businessResult.length; j++) {//Monate index
                    int moMinIndex = 0;
                    int moMaxindex = 0;
                    if (businessResult[j] > min) {
                        moMinIndex = j;
                    }
                    if (businessResult[j] == max) {
                        moMaxindex = j;

                    }
                    System.out.println("GesamteResunlt   " + summe);
                    System.out.println("Die Minimalswert: " + min);
                    System.out.println("Die Monate mit Minimalswert: " + moMinIndex);
                    System.out.println("Die MAXIMALSWERT: " + max);
                    System.out.println("Die Monate mit MAXIMALSWERT: " + moMaxindex);
                }
            }
            System.out.println();
        }


}
