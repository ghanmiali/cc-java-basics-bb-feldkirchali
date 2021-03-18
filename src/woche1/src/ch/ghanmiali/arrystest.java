package ch.ghanmiali;

import javax.sql.rowset.serial.SQLOutputImpl;
import java.util.Arrays;

public class arrystest {
    public static void main(String[] args) {

        int[] test = {2, 11, 16, 99};
        System.out.println(Arrays.toString(test));
        String a = "[";
        System.out.print(a);
        for (int i = 0; i <test.length; i++) {
            System.out.print(test[i]);
            if(i<test.length-1){
                System.out.print(",");

            }

            }
            String b = "]";
            System.out.print(b);
        }

    }




