
package pakiet1;

import org.apache.log4j.Logger;

public class Kalkulator {
    private final Operacje operacje;
    private static final Logger logger = Logger.getLogger(Kalkulator.class);

    public Kalkulator() {
        operacje = new Operacje();
    }

    /**
     * Dodaje dwie liczby.
     *
     * @param a pierwsza liczba
     * @param b druga liczba
     * @return suma dwóch liczb
     */
    public double dodaj(double a, double b) {
        double suma = operacje.dodaj(a, b);
        logger.info("Dodawanie: " + a + " + " + b + " = " + suma);
        return suma;
    }

    /**
     * Odejmuje jedną liczbę od drugiej.
     *
     * @param a liczba, od której odejmujemy
     * @param b liczba, którą odejmujemy
     * @return różnica między dwiema liczbami
     */
    public double odejmij(double a, double b) {
        double roznica = operacje.odejmij(a, b);
        logger.info("Odejmowanie: " + a + " - " + b + " = " + roznica);
        return roznica;
    }

    /**
     * Mnoży dwie liczby.
     *
     * @param a pierwsza liczba
     * @param b druga liczba
     * @return iloczyn dwóch liczb
     */
    public double pomnoz(double a, double b) {
        double iloczyn = operacje.pomnoz(a, b);
        logger.info("Mnożenie: " + a + " * " + b + " = " + iloczyn);
        return iloczyn;
    }
}
