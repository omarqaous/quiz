package org.example;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.model.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Create sample contacts
        List<Contact> contacts = createSampleContacts();

        // Sort contacts by last names (ascending order)
        contacts.sort(Comparator.comparing(Contact::getLastName));

        // Convert contacts to JSON format and print to console
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonOutput = gson.toJson(contacts);
        System.out.println(jsonOutput);
    }

    private static List<Contact> createSampleContacts() {
        List<Contact> contacts = new ArrayList<>();

        // Create and add sample contacts
        Contact contact1 = new Contact("David", "Sanger",
                "Argos LLC",
                "Sales Manager");
        contact1.addPhoneNumber("240-133-0011", "Home");
        contact1.addPhoneNumber("240-112-0123", "Mobile");
        contact1.addEmailAddress("dave.sang@gmail.com", "Home");
        contact1.addEmailAddress("dsanger@argos.com", "Work");
        contacts.add(contact1);

        Contact contact2 = new Contact("Carlos", "Jimenez", "Zappos", "Director");
        contacts.add(contact2);

        Contact contact3 = new Contact("Ali", "Gafar", "BMI Services", "HR Manager");
        contact3.addPhoneNumber("412-116-9988", "Work");
        contact3.addEmailAddress("ali@bmi.com", "Work");
        contacts.add(contact3);

        return contacts;
    }
}