package ch.ghanmiali;

import java.util.Arrays;

public class function2 {

    public static void main(String[] args) {
        String[] name = {
                "Peter", "Anna", "Ali", "Hans", "Dniella", "Anna", "F"};

        String[] sortedname = sort(name);

        int lennameindex = getLennameindex(name);
        System.out.println("imdex der längste:   " + lennameindex);
        System.out.println(Arrays.toString(name));

        counter(1,10);// mit void counter verbumden

    }

    /***
     * macht eine copy von original array
     * @param name
     * @return sorted copy von das array
     */
    private static int getLennameindex(String[] name) {
        int lenname = 0;
        int lennameindex = 0;
        for (int i = 0; i < name.length; ++i) {
            if (name[i].length() > lenname) {
                lennameindex = i;
                lenname = name[i].length();

            }
        }
        return lennameindex;
    }


    public static String[] sort(String[] name) {
        String[] nameCopy = Arrays.copyOf(name, name.length);

        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < name.length - 1; i++) {
                if (nameCopy[i].compareTo(nameCopy[i + 1]) > 0) {
                    swapped = true;
                    String temp = nameCopy[i];
                    nameCopy[i] = nameCopy[i + 1];
                    nameCopy[i + 1] = temp;
                }
            }
        }
        return nameCopy;
    }
    public static void counter (int start,int end) {
        CounterOhneschleife(start, end);

    }

    /***
     * Counter ohne schleife
     * @param start
     * @param end
     */
    private static void CounterOhneschleife(int start, int end) {
        System.out.println(start);

        int increment = start + 1;
        if(start<end){
            counter(increment,end);
        }
    }
}