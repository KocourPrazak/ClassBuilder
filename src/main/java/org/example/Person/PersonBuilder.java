package org.example.Person;

public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age = 0;
    protected String city = "";

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age >= 0 && age < 200) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age is out of range");
        }
        return this;
    }

    public PersonBuilder setAddress(String city) {
        this.city = city;
        return this;
    }

    public Person build() {
        if (name == null || surname == null) {
            throw new IllegalStateException("Not enough information provided. Name/Surname cannot be null: Name: "
                    + name + " Surname: " + surname);
        } else return new Person(this.name, this.surname, age, city);
    }
}