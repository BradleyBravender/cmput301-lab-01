package com.example.petshop;

import java.util.Date;

public abstract class Pet {
    String name;
    Date birthdate;

    Pet(String name) {
        // Call the other constructor
        this(name, new Date());
    }

    Pet(String name, Date birthDate) {
        this.name = name;
        this.birthdate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public abstract String speak();
}
