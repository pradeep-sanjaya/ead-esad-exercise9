package com.sliit;

import com.sliit.impl.PersonImpl;
import com.sliit.impl.RemotePersonImpl;

public class AdapterTest {
    public static void main(String[] args) {
        Person person = new PersonImpl();
        RemotePerson remotePerson = new RemotePersonImpl();

        System.out.println("Person says");
        System.out.println(person.generateFullName());
        System.out.println(person.generateFullAddress());

        System.out.println("\nRemote person says");
        System.out.println(remotePerson.getFirstName());
        System.out.println(remotePerson.getLastName());
        System.out.println(remotePerson.getAddressLine1());
        System.out.println(remotePerson.getAddressLine2());

        System.out.println("\nPerson adapter says");
        PersonAdapter personAdapter = new PersonAdapter(remotePerson);
        System.out.println(personAdapter.generateFullName());
        System.out.println(personAdapter.generateFullAddress());
    }
}
