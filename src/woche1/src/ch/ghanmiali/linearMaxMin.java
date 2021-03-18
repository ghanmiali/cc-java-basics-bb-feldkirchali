package ch.ghanmiali;

import java.util.Arrays;

public class linearMaxMin {
    public static void main(String[] args) {
        int[] businessResult ={1000, 20, -5, 3, 1, 3000, 11, -13, 0, -11111, -17, -17};
        System.out.println("Summe:              " + summe(businessResult));
        System.out.println("Min_Monate_umsatz:  " + min(businessResult));
        System.out.println("Max_Monate_umsatz:  " + max(businessResult));
        // System.out.println("ZweiteMax_Monate_umsatz:  " + zweiMax(businessResult));
        System.out.println("Monaten:            " + businessResult.length);
        // System.out.println("allmaxmo:            " + allmax(businessResult));

        int suchen = max(businessResult);
        int indexmax = 0;
        boolean gefunden = false;
        while (indexmax < suchen && !gefunden)
            if (businessResult[indexmax] == max(businessResult)) {
                gefunden = true;
            } else {
                indexmax++;
            }
        if (gefunden)

            System.out.println("Monate mit Maximale Umsatz: " + (indexmax + 1));// das +1 für length&Monate ausgleich


        int suchenmin = min(businessResult);
        int indexMin = 0;
        boolean found = false;
        while (indexMin > suchenmin && !found)
            if (businessResult[indexMin] == min(businessResult)) {
                found = true;
            } else {
                indexMin++;
            }
        if (found)

            System.out.println("Monate mit minimale Umsatz: " + (indexMin + 1));// das +1 für length&Monate ausgleich
/*
        int max1 = 0;
        int max2 = 0;
        int speicher = 0;
        int num = 0;

        for (int i = 0; i < businessResult.length; i++) {
            num = businessResult[i];
            if (max1 < num) {
                speicher = max1;
                max1 = num;
                num = speicher;
            }
            if (max2 < num) {
                speicher = max2;
                max2 = num;
                num = speicher;

            }
        }

        System.out.println("zweite maximal Umsatz: " + max2);// das +1 für length&Monate ausgleich
*/
        int temp;
        int[] copy = Arrays.copyOf(businessResult, businessResult.length);
        for (int i = 0; i < copy.length - 1; i++) {
            for (int j = i + 1; j < copy.length; j++) {
                if (copy[i] < copy[j]) {
                    temp = copy[i];
                    copy[i] = copy[j];
                    copy[j] = temp;


                }
            }
        }
        System.out.println("Zweite Höchste Umsatz: " + businessResult[1]);

//-----------------------------Zweit Negative Resultat hintereinander-------------------------------------------------
        boolean wasNegative = false;
        for (int result : businessResult) {
            if (result < 0) {
                if (wasNegative) {
                    System.out.println(result + "  Ja es waren 2 monate mit negative ergebnis");
                    break;
                } else {
                    wasNegative = true;

                }
            } else {
                wasNegative = false;
//--------------------------------------Längste Negative Periode----------------------------------
            }
        }
        int negativeCounter2 = 0;
        int negativeCounter = 0;
        // boolean wasNegative = false;
        for (int result2 : businessResult) {
            if (result2 < 0) {
                // if (wasNegative) {
                negativeCounter++;
                if (negativeCounter > negativeCounter2) {
                    negativeCounter2 = negativeCounter;
                }
                    // wasNegative = true;
                } else {
                    // wasNegative = false;
                    // if (negativeCounter > negativeCounter2) {
                    // negativeCounter2 = negativeCounter;

                    negativeCounter = 0;
                }



        }
        System.out.println("Längste Negative Periode " + negativeCounter2);


        //------------------------Max_second:max for_schleife--------------------------------
        int maxV = Integer.MIN_VALUE;
        int smaxV =Integer.MIN_VALUE;
        for (int result3 : businessResult) {

            if (result3 > maxV) {
                smaxV = maxV;
                maxV = result3;
            } else if (result3 > smaxV) {//für den fall das der zweite wert nach den erst grösste
                smaxV = result3;
            }
        }

        System.out.println("maximal:  " + maxV + " 2Maximal:  " + smaxV);



 /*
        int counter = 0;
        boolean negativResult = false;
        String result = "Yes";
        String negativeResult = "NO";
        for (int i = 0; i < businessResult.length - 1; i++) {
            for (int j = i + 1; j < businessResult.length - 1; j++) {
                if (i < j && j < 0) {
                    counter++;


                    if (i < j && j >= 0) {
                        counter = 0;
                    }
                    if (counter <= 1) ;

                    System.out.println("Zwei negative monate infolge):  " + negativeResult);
                }

*/
     /* //  boolean statment= Ja;
       // boolean  negative=false ;
        int temp2;
        int counter =0;
        boolean negativ =false;
        for (int i = 0; i < businessResult.length -1; i++) {
            for (int j = i + 1; j < businessResult.length; j++) {
                if (businessResult[i] < businessResult[j]) {
                    temp2 = businessResult[i];
                    businessResult[i] = businessResult[j];
                    businessResult[j] = temp2;

                    if(businessResult[i] < 0 && businessResult[j]<0) {
                        counter++;
                        if (businessResult[i] < 0 || businessResult[j]<0)
                        {
                        break;
                            while (counter >= 2) {
                                negativ = true;

                                System.out.println("Negative:  " + "Yes");
                            }else{
                                System.out.println("Negative:  " + "No");
*/
    }


    public static int max(int[] x) {
        return maximalesWert(x);

    }

    private static int maximalesWert(int[] x) {
        int moMaxValue = x[0];
        for (int i = 0; i < x.length - 1; i++) {
            if (x[i] > moMaxValue) {
                moMaxValue = x[i];
            }
        }
        return moMaxValue;
    }


    public static int min(int[] x) {
        return minimalesWert(x);
    }

    private static int minimalesWert(int[] x) {
        int moMinValue = x[0];
        for (int i = 0; i < x.length - 1; ++i) {
            if (x[i] < moMinValue)
                moMinValue = x[i];

        }
        return moMinValue;
    }

    public static int summe(int[] x) {
        return SummeTotal(x);

    }

    private static int SummeTotal(int[] x) {
        int umsatz = 0;
        for (int i = 0; i < x.length; i++) {
            umsatz += x[i];


        }
        return umsatz;
    }
}