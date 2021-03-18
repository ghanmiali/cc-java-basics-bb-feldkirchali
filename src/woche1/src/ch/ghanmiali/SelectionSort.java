package ch.ghanmiali;

import java.util.Arrays;

public class SelectionSort{
    //  public static void main(String[] args) {
    /*    int[] myNumber = {6,23,78,1,34,12};
       Arrays.sort(myNumber);
        System.out.println(Arrays.toString(myNumber));



  for (int number: myNumber){
      int c = 1000;
      for(int i=0; i<c; i++){
          if (i==number){
              System.out.println(number);
              break;
*/

    public static void SelectionSort(int sort) {

        System.out.println("SelectionSort");
        int[] arr = {20, 51, 2, 16, 7, 38};

        int comCounter = 0;
        int changCounter = 0;
        int smalElem = 0;
        int smalElemIndex = 0;

        int temp = 0;
       // int arrlen = arr.length;
        boolean toChang = false;

        for (int i = 0; i < arr.length-1 ; i++) {
            toChang = false;
            smalElem = arr[i];
            comCounter += 1;

            for (int j = 0; i < arr.length; j++) {
                comCounter += 1;
                if (arr[j] < smalElem) {
                    smalElem = arr[j];
                    smalElemIndex = j;
                    toChang = true;
                }
            }
        }


/*
        if (toChang) {
            changCounter += 1;
            temp = arr[i];
            arr[i] = smalElem;
            arr[smalElemIndex] = temp;


        }


        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + "  ");

            System.out.println("vergleich" + comCounter);
            System.out.println("ChangZahl" + changCounter);
        }

*/

    }
}









