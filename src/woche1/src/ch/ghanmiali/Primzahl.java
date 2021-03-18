package ch.ghanmiali;

public class Primzahl {
    public static void main(String[] args) {

    int a =2;

for(a=2;a<50;a++){// primzahl definieren
        boolean aa = true;//primzahl als wahr
        for(int divisor =2; divisor < a; divisor++){//devisor counter

            if(a % divisor == 0 ) {//primzahl durch devisor teile sobald 0 ergibt ist falsch
                aa = false;
            }}
        if(aa){
            System.out.print(a + ";");

        }

        }}}
