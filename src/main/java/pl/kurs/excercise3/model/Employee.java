package pl.kurs.excercise3.model;

import java.io.Serializable;

public class Employee extends Person implements Serializable {

    private String position;
    private double income;

    public Employee() {

    }

    public Employee(String firstName, String lastname, String socialSecurityNumber, String homeTown, String position,
                    double income) {
        super(firstName, lastname, socialSecurityNumber, homeTown);
        this.position = position;
        this.income = income;
    }

    @Override
    public double getSalary() {
        return income;
    }

    public String getPosition() {
        return position;
    }

    public double getIncome() {
        return income;
    }

    @Override
    public String toString() {
        return super.toString() + position + ", " + income;
    }
}
