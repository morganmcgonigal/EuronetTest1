package com.company;

import java.util.ArrayList;

public class Person {

    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private ArrayList<String> hobbies = new ArrayList<String>();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<String> getHobbies() {
        return hobbies;
    }

    public String getHobbyItem(int i){
        return  hobbies.get(i);
    }

    public void setHobbies(ArrayList<String> hobbies) {
        this.hobbies = hobbies;
    }
}
