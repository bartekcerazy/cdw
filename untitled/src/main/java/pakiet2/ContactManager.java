package pakiet2;

import java.util.ArrayList;
import java.util.List;
public class ContactManager {
    private final List<Contact> contacts = new ArrayList<>();

    public ContactManager() {
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public List<Contact> getContacts() {
        return contacts;
    }
}