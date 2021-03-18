package A;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);


        int rnd = (int) (Math.random() * 100);
        System.out.println(rnd);
        System.out.println(" rate meine Zahl ");

        int userInput = scanner.nextInt();


        for (int a = 1; a < 3; a++) {
            int userInput1 = scanner.nextInt();
            
            if (userInput1 == rnd) {
                System.out.println("right");
                a = 3;
            }

            if (a == 2) {
                System.out.println("du hast die Zahl nicht erraten !!");
            }
        }


        //System.out.println(a);

        // if (rnd = )


        // scanner.nextInt();

    }
}

// int rnd = (int)(Math.random() * 100);
// Math.random() * (Max - Min)