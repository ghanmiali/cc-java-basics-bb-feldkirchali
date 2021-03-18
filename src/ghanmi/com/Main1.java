package ghanmi.com;

import java.util.*;

public class Main1 {

    public static void main(String[] args) {

        //Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Length of array?");

        int length = scanner.nextInt();
        List<Integer> number = new ArrayList<>(length);

//        for (int i = 0; i < number.length; i++)
//        {
//            number[i] = rand.nextInt(10) + 1;
//        }

        for (int i = 0; i < length; i++)
        {
            number.add(i + 1);
        }
        Collections.shuffle(number);

        for (int i = 0; i < number.size(); i++)
        {
            System.out.print(number.get(i) + " ");
        }

        System.out.println("");

        //int sortedNumber[] = sort(number);
        List<Integer> sortedNumber = sort(number);

        for (int i = 0; i < sortedNumber.size(); i++)
        {
            System.out.print(sortedNumber.get(i) + " ");
        }
    }

    public static List<Integer> sort(List<Integer> number)
    {

        boolean success = false;
        while(success != true)
        {
            success = true;
            for (int i = 0; i < number.size() - 1; i++)
            {
                while (number.get(i) > number.get(i + 1))
                {
                    int temp = number.get(i);
                    int temp2 = number.get(i + 1);
                    number.set(i + 1, temp);
                    number.set(i, temp2);
                    success = false;
                }
            }
        }

        List<Integer> sortedNumber = number;
        return sortedNumber;
    }
}
