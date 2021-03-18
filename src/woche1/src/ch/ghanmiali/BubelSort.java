package ch.ghanmiali;

import java.util.Arrays;

public class BubelSort {
    public static void main(String[] args) {

        int[] buffer = {1, 22, -5, 3, 10, -2, -1, -3, 0, 3, 6, 7};
        System.out.println("zahlenunsortiert: " + Arrays.toString(buffer));
        for (int i = 0; i < buffer.length; i++) {
            for (int j = 0; j < buffer.length-1-i; j++) {//dami er die kontroliert nicht mehr wiederholt
                if (buffer[j] < buffer[j+1]) {
                    int temp = buffer[j];
                    buffer[j] = buffer[j+1];
                    buffer[j+1] = temp;
                }

            }

            System.out.println("Sortiert          " + Arrays.toString(buffer));
        }
        System.out.println(Arrays.stream(buffer));
    }
}
