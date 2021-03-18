package ch.ghanmiali;

public class schaltjahr {
    public static void main(String[] args) {
        /*

        //------------------schaltjahr von 1800-2100----For schleife
        int schalt = 0;
        for (int i = 1800; i < 2100; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                schalt = i;


                System.out.println("schaltjahr:  " + schalt);

            }

        }
    }
}
*/
//-------------schaltjahr von 1800-2100----For schleife mit boolean, true_false
        /*

        boolean Condition = false;
        for (int i = 1800; i < 2100; i++) {
            if (i % 4 == 0 && i % 100 != 0) {
                Condition = true;

                if (i % 400 == 0) {
                    Condition = true;


                    }
                        System.out.println("schaltJahr:  " + i);
                    }
                }}}



  //------------------schaltjahr von 1800-2100----For schleife und Counter
         */
/*
        int SchaltJahrCounter = 0;
        for(int i=1800; i<2100;i++) {
            if (i % 4 == 0 && i % 100 != 0) {
                SchaltJahrCounter++;
                if (i % 400 == 0) {
                    SchaltJahrCounter++;

                } else {
                    SchaltJahrCounter = 0;
                    System.out.println("SchalJahr zwischen1800_2100:  " + i);

        }}}}}



 */

// *schaltjahr von 1800-2100----For boolean//anderesweg
/*
        for (int i = 1800; i < 2100; i++) {
            boolean condition = i % 4 == 0 && i % 100 != 0;
            boolean condition2 = i % 400 == 0;
            boolean Noschalt = !condition & !condition2;
            if (!Noschalt) {
                System.out.println(i);
            }
        }
    }
}

 */
        for (int i = 1800; i <= 2100; i++) {
            System.out.println(!(i % 4 == 0 && i % 100 != 0) |(i % 400 == 0)? "": i);
        }
    }
}
