package pakiet2;

public class Contact {
    private final String name;
    private final String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Zwraca imię kontaktu.
     *
     * @return imię kontaktu
     */
    public String getName() {
        return name;
    }

    /**
     * Zwraca numer telefonu kontaktu.
     *
     * @return numer telefonu kontaktu
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }
}
