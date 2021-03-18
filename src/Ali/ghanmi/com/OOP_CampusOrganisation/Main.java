package Ali.ghanmi.com.OOP_CampusOrganisation;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("first number");
        double userInput = scanner.nextDouble();

        System.out.println(" + - * /");
        scanner.nextLine();
        String userInput1 = scanner.nextLine();

        System.out.println("second number");
        double userInput2 = scanner.nextDouble();

        if (userInput1.equals("+")){
            double a = userInput + userInput2;
            System.out.println(a);
        };
        if (userInput1.equals("-")){
            double a = userInput - userInput2;
            System.out.println(a);
        };
        if (userInput1.equals("*")) {
            double a = userInput * userInput2;
            System.out.println(a);
        }
        if (userInput1.equals("/")) {
            double a = userInput / userInput2;
            System.out.println(a);
        }
        else System.out.println(" das ist ein Rechner");
             return;

         

    }

    }

