package ch.ghanmiali;

public class palindrom {
    public static void main(String[] args) {
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