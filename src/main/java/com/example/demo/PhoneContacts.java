package com.example.demo;
import java.util.*;

public class PhoneContacts {

    ArrayList<Contact> contacts = new ArrayList<Contact>();

    public boolean contains(Contact contact)
    {
        for (Contact c : contacts) {
            if (c.equals(contact))
                return true;
        }
        return false;
    }

    public void addContact(Contact newContact){
        if (!contains(newContact))
            contacts.add(newContact);
    }

    public int size() {
        return contacts.size();
    }

    public ArrayList<Contact> getAllContacts() {
        return contacts;
    }


}
