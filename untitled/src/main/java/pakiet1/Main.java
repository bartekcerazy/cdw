package pakiet1;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);

    /**
     * Metoda główna programu.
     *
     * @param args argumenty wiersza poleceń
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę: ");
        double liczba1 = scanner.nextDouble();

        System.out.print("Podaj drugą liczbę: ");
        double liczba2 = scanner.nextDouble();

        System.out.println("Wybierz operację:");
        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnożenie");

        int wybor = scanner.nextInt();

        Kalkulator kalkulator = new Kalkulator();

        switch (wybor) {
            case 1:
                double suma = kalkulator.dodaj(liczba1, liczba2);
                System.out.println("Suma: " + suma);
                logger.info("Suma: " + suma);
                break;
            case 2:
                double roznica = kalkulator.odejmij(liczba1, liczba2);
                System.out.println("Różnica: " + roznica);
                logger.info("Różnica: " + roznica);
                break;
            case 3:
                double iloczyn = kalkulator.pomnoz(liczba1, liczba2);
                System.out.println("Iloczyn: " + iloczyn);
                logger.info("Iloczyn: " + iloczyn);
                break;
            default:
                System.out.println("Nieprawidłowy wybór operacji.");
                logger.warn("Nieprawidłowy wybór operacji.");
        }

        scanner.close();
    }
}
