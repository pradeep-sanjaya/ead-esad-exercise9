package com.sliit.impl;

import com.sliit.RemotePerson;

public class RemotePersonImpl implements RemotePerson {

    private static String FIRST_NAME = "Pradeep";
    private static String LAST_NAME  = "Sanjaya";
    private static String ADDRESS1   = "Pothuarawa Road";
    private static String ADDRESS2   = "Malabe";

    @Override
    public String getFirstName() {
        return FIRST_NAME;
    }

    @Override
    public String getLastName() {
        return LAST_NAME;
    }

    @Override
    public String getAddressLine1() {
        return ADDRESS1;
    }

    @Override
    public String getAddressLine2() {
        return ADDRESS2;
    }
}
