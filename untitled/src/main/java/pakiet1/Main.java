package pakiet1;

import java.util.Scanner;
\\klasa main
public class Main {
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
                break;
            case 2:
                double roznica = kalkulator.odejmij(liczba1, liczba2);
                System.out.println("Różnica: " + roznica);
                break;
            case 3:
                double iloczyn = kalkulator.pomnoz(liczba1, liczba2);
                System.out.println("Iloczyn: " + iloczyn);
                break;
            default:
                System.out.println("Nieprawidłowy wybór operacji.");
        }

        scanner.close();
    }
}