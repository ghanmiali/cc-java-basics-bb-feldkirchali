package ch.ghanmiali;

public class primzalübung {
    public static void main(String[] args) {
        for(int i=2;i<100;i++){
         //   boolean primz = true;
            for (int j=2;j<9;j++){
                boolean primz = true;
                if (i/j == 0) {
                    primz = false;
                    break;
                }
                    System.out.println(i);

                }
                System.out.println();
            }
        }
    }

