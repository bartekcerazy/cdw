package pakiet2;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContactManager contactManager = new ContactManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Dodaj kontakt");
            System.out.println("2. Wyświetl kontakty");
            System.out.println("3. Zakończ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Pobierz znak nowej linii po wyborze opcji

            switch (choice) {
                case 1:
                    System.out.println("Podaj imię:");
                    String name = scanner.nextLine();
                    System.out.println("Podaj numer telefonu:");
                    String phoneNumber = scanner.nextLine();
                    contactManager.addContact(new Contact(name, phoneNumber));
                    System.out.println("Kontakt został dodany.");
                    break;
                case 2:
                    List<Contact> contacts = contactManager.getContacts();
                    if (contacts.isEmpty()) {
                        System.out.println("Brak kontaktów.");
                    } else {
                        System.out.println("Lista kontaktów:");
                        for (Contact contact : contacts) {
                            System.out.println(contact.getName() + " - " + contact.getPhoneNumber());
                        }
                    }
                    break;
                case 3:
                    System.out.println("Program zakończony.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nieprawidłowy wybór.");
                    break;
            }
        }
    }
}
