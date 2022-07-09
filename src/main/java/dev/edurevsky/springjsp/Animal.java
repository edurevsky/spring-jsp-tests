package dev.edurevsky.springjsp;

import java.time.Instant;
import java.util.Date;

public class Animal {

    private String name;
    private Date birthDate = Date.from(Instant.now());

    public Animal() {

    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    private void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
