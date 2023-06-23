package pakiet1;
//klasa kalkulatora
public class Kalkulator {
    private final Operacje operacje;

    public Kalkulator() {
        operacje = new Operacje();
    }

    public double dodaj(double a, double b) {
        return operacje.dodaj(a, b);
    }

    public double odejmij(double a, double b) {
        return operacje.odejmij(a, b);
    }

    public double pomnoz(double a, double b) {
        return operacje.pomnoz(a, b);
    }
}