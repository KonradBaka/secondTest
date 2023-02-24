package pl.kurs.excercise3.model;

import java.io.Serializable;

public abstract class Person implements Serializable {

    private String firstName;
    private String lastname;
    private String socialSecurityNumber;
    private String homeTown;


    public Person() {

    }

    public Person(String firstName, String lastname, String socialSecurityNumber, String homeTown) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.socialSecurityNumber = socialSecurityNumber;
        this.homeTown = homeTown;
    }

    public abstract double getSalary();


    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public String getHomeTown() {
        return homeTown;
    }

    @Override
    public String toString() {
        return "\n" + getClass().getSimpleName() + ", " +  firstName + ", " + lastname + ", " + socialSecurityNumber +
                ", " + homeTown + ", ";
    }
}
