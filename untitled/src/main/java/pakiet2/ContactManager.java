package pakiet2;

import java.util.ArrayList;
import java.util.List;

public class ContactManager {
    private final List<Contact> contacts = new ArrayList<>();

    public ContactManager() {
    }

    /**
     * Dodaje kontakt do listy kontaktów.
     *
     * @param contact kontakt do dodania
     */
    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    /**
     * Zwraca listę kontaktów.
     *
     * @return lista kontaktów
     */
    public List<Contact> getContacts() {
        return contacts;
    }
}
