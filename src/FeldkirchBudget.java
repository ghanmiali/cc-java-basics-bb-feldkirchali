import ghanmi.com.SimpleCSVReader;

import java.util.Arrays;

import static java.lang.Integer.parseInt;

public class FeldkirchBudget {
    public static void main(String[] args) {
        String[][] budget2019 = SimpleCSVReader.readCSV("C:\\Users\\DCV\\Downloads\\offenerhaushalt_fk_2019.csv", ";");
        String[][] sortedbudget2019 = sortedString(budget2019);

        cleanBudget(budget2019);
        budgetsumme(budget2019);
        System.out.println("********************Top 10 der größten Einzelposten******************");
        maxBeträgeString(sortedbudget2019);
        System.out.println("********************Top 10 der kleinsten Einzelposten****************");
        minBeträgeString(sortedbudget2019);
        System.out.println("********************Ausgaben für Schulen****************");
        sectorSchuleAusgabe(budget2019);
        System.out.println("********************Anteil Ausgaben für Schulen ****************");
        getAnteilSchule(budget2019);
        System.out.println("********************Ausgaben für Kindergärten ****************");
        sectorKinderGartenAusgabe(budget2019);
        System.out.println("********************Anteil für Kindergärten ****************");
        getAnteilKindergärten(budget2019);
    }

    private static double getAnteilKindergärten(String[][] budget2019) {

        double anteil = ((sectorKinderGartenAusgabe(budget2019) * 100) / budgetsumme(budget2019));
        System.out.println(anteil + "%");
        return anteil;
    }

    private static double getAnteilSchule(String[][] budget2019) {

        double anteil = (sectorSchuleAusgabe(budget2019) * 100) / budgetsumme(budget2019);
        System.out.println(anteil + "%");
        return anteil;
    }


    private static String[][] sortedString(String[][] budget2019) {

        // String[][] copy = Arrays.copyOf(arr, arr.length);
        String[][] copy = SimpleCSVReader.readCSV("C:\\Users\\DCV\\Downloads\\offenerhaushalt_fk_2019_2.csv", ";");
        for (int i = 1; i < copy.length; i++) {
            for (int j = 2; j < copy.length - 1; j++)

                if (parseInt(copy[i][2]) > parseInt(copy[j][2])) {
                    String[] temp = copy[i];
                    copy[i] = copy[j];
                    copy[j] = temp;

                }
        }

        return copy;
    }


    private static boolean isValid(String arr) {

        try {
            Integer.parseInt(String.valueOf(arr));
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    public static int budgetsumme(String[][] s) throws NumberFormatException {
        int summe = 0;
        for (String[] strings : s) {
            if (strings[2] != null) {
                summe += Integer.parseInt(strings[2]);

            }
        }
        System.out.println(summe);
        return summe;
    }

    private static String[][] cleanBudget(String[][] arr) {
        arr[0] = new String[3];
        for (int i = 1; i < arr.length; i++) {
            String betrag = arr[i][2];
            if (Integer.parseInt(betrag) == 0) {
                arr[i] = new String[3];
                System.out.println("Summe gleich Null " + i);
            }


        }


        return arr;
    }

    public static void maxBeträgeString(String[][] s) throws NumberFormatException {
        int beträge = 12;
        for (int i = 2; i < s.length; i++) {
            if (i < beträge) {
                System.out.println(Arrays.toString(s[i]));
            }
        }
    }

    public static void minBeträgeString(String[][] s) throws NumberFormatException {
        ;
        int countMIn10 = 0;
        for (int i = s.length - 1; i > 1; i--) {
            int value = Integer.parseInt(s[i][2]);
            if ((value >0)) {
                countMIn10++;
                System.out.println(Arrays.toString(s[i]));
            }if(countMIn10 == 10){
                break;
            }
        }
    }


    public static int sectorSchuleAusgabe(String[][] arr) throws NumberFormatException {

        String s1 = "Volksschule", s2 = "Mittelschule", s3 = "Polytechnische";
        int summeSchule = 0;
        for (int i = 2; i < arr.length; i++) {
            if ((arr[i] != null) && (arr[i][0] != null) && (arr[i][2] != null)) {
                assert arr[i][2] != null;

                if (arr[i][0].contains(s1) || (arr[i][0]).contains(s2) || arr[i][0].contains(s3)) {

                    summeSchule += Integer.parseInt(arr[i][2]);
                }
            }
        }
        System.out.println(summeSchule);

        return summeSchule;
    }

    public static int sectorKinderGartenAusgabe(String[][] arr) throws NumberFormatException {

        String s1 = "Kindergärten", s2 = "Ganztagskindergarten";
        int KindergärtenSumme = 0;
        for (int i = 2; i < arr.length; i++) {
            if ((arr[i] != null) && (arr[i][0] != null) && (arr[i][2] != null)) {
                assert arr[i][2] != null;

                if (arr[i][0].contains(s1) || (arr[i][0]).contains(s2)) {

                    KindergärtenSumme += Integer.parseInt(arr[i][2]);
                }
            }
        }
        System.out.println(KindergärtenSumme);

        return KindergärtenSumme;
    }

}


