package pl.kurs.excercise3.model;

import java.io.Serializable;

public class Student extends Person implements Serializable {

    private String group;
    private double scholarship;

    public Student() {

    }

    public Student(String firstName, String lastname, String socialSecurityNumber, String homeTown, String group,
                   double scholarship) {
        super(firstName, lastname, socialSecurityNumber, homeTown);
        this.group = group;
        this.scholarship = scholarship;
    }

    @Override
    public double getSalary() {
        return scholarship;
    }

    public String getGroup() {
        return group;
    }

    public double getScholarship() {
        return scholarship;
    }

    @Override
    public String toString() {
        return super.toString() + group + ", " + scholarship;
    }
}
