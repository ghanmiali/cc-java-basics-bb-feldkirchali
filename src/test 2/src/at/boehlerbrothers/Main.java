package at.boehlerbrothers;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //int i = 0;

        //for (i = 0 ; i <=100; i++){
        //   System.out.println(i);}

        //for (int i = 0 ; i <=100; i +=2){
        //    System.out.println(i);}

        for (int i = 0 ; i <=100; i +=2){
            //System.out.println(i);
            if (i < 50) {
                System.out.println(i + " small");}
            if (i > 50) {
                System.out.println(i + " big");}
            if (i == 50) {
                System.out.println(i + " hit");}
            if ( i % 2 == 0) {
                System.out.println(i); }
            if ( i == 78){
                i = 1000;
            }

        }

        int i =3 ;
        double b = 8;

        System.out.println(b/ i );
         double result = b/i;
        System.out.println(result);







    }
}
