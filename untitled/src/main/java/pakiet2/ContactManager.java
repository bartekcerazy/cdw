package pakiet2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ContactManager {
    private List<Contact> contacts = new ArrayList<>();

    public ContactManager() {
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public List<Contact> getContacts() {
        return contacts;
    }
}