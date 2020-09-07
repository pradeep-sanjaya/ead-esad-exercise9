package com.sliit.impl;

import com.sliit.Person;

public class PersonImpl implements Person {

    private static String FULL_NAME    = "Pradeep Sanjaya";
    private static String FULL_ADDRESS = "Pothuarawa Road, Malabe";

    @Override
    public String generateFullName() {
        return FULL_NAME;
    }

    @Override
    public String generateFullAddress() {
        return FULL_ADDRESS;
    }
}
