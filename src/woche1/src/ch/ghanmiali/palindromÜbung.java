package ch.ghanmiali;

public class palindromÜbung {
    public static void main(String[] args) {
        String[] myNameList = {"anna", "peter", "rentner"};
        //int myNameList = myNameList.length();
        //String name = myNameList[0];
        for (String name : myNameList) {
            boolean isPalin = true;
            for (int i = 0; i < name.length() / 2; i++) {
                if (name.charAt(i) != name.charAt(name.length() - 1 - i)) {

                    isPalin = false;
                    break;
                }
                // System.out.println(isPalin);
            }
            if (isPalin) {
                System.out.println(name + " ist ein Palindrom");
            } else {
                System.out.println(name + " ist kein Palindrom");
            }
        }
    }
}
 /*
//
String name = "anna";
        boolean isPalin = true;
        int lenName = name.length();
        for (int i = 0; i < lenName / 2; i++) {
            if (name.charAt(i) != name.charAt(lenName - 1 - i)) {
                isPalin = false;
                break;
            }
            System.out.println(isPalin);
        }
    }
}
*/


