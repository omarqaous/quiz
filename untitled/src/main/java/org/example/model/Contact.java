package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    private String firstName;
    private String lastName;
    private String company;
    private String jobTitle;
    private List<PhoneNumber> phoneNumbers;
    private List<EmailAddress> emailAddresses;

    public Contact(String firstName, String lastName, String company, String jobTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.jobTitle = jobTitle;
        this.phoneNumbers = new ArrayList<>();
        this.emailAddresses = new ArrayList<>();
    }

    // Getters and setters for fields
    // ...

    // Methods to manage phone numbers
    public void addPhoneNumber(String number, String label) {
        phoneNumbers.add(new PhoneNumber(number, label));
    }

    public void updatePhoneNumber(int index, String number, String label) {
        if (index >= 0 && index < phoneNumbers.size()) {
            phoneNumbers.set(index, new PhoneNumber(number, label));
        }
    }

    public void deletePhoneNumber(int index) {
        if (index >= 0 && index < phoneNumbers.size()) {
            phoneNumbers.remove(index);
        }
    }

    // Methods to manage email addresses
    public void addEmailAddress(String address, String label) {
        emailAddresses.add(new EmailAddress(address, label));
    }

    public void updateEmailAddress(int index, String address, String label) {
        if (index >= 0 && index < emailAddresses.size()) {
            emailAddresses.set(index, new EmailAddress(address, label));
        }
    }

    public void deleteEmailAddress(int index) {
        if (index >= 0 && index < emailAddresses.size()) {
            emailAddresses.remove(index);
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompany() {
        return company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public List<EmailAddress> getEmailAddresses() {
        return emailAddresses;
    }
}
