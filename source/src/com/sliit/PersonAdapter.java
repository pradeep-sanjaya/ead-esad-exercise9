package com.sliit;

public class PersonAdapter implements Person {

    private static String SEPERATOR = " ";

    RemotePerson remotePerson;

    public PersonAdapter(RemotePerson remotePerson) {
        this.remotePerson = remotePerson;
    }

    @Override
    public String generateFullName() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(remotePerson.getFirstName());
        stringBuilder.append(SEPERATOR);
        stringBuilder.append(remotePerson.getLastName());
        return stringBuilder.toString();
    }

    @Override
    public String generateFullAddress() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(remotePerson.getAddressLine1());
        stringBuilder.append(SEPERATOR);
        stringBuilder.append(remotePerson.getAddressLine2());
        return stringBuilder.toString();
    }
}
