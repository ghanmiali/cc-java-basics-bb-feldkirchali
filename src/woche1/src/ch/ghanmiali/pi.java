package ch.ghanmiali;

public class pi {
    public static void main(String[] args) {

        int nenner1 = 3;
        double calcPi = 4;

        for (int i=0; i<50000;++i)
        {
            calcPi = calcPi-(4.0 / nenner1) + (4.0 / (nenner1+2));
            nenner1+=4;
            System.out.println(calcPi);
        }
}}
