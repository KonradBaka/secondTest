package pl.kurs.excercise3.service;

import pl.kurs.excercise3.model.Person;

public class PersonService {

    private Person person;

    public static double getHighestIncome(Person[] people) {
        double highestIncome = people[0].getSalary();
        for (int i = 1; i < people.length; i++) {
            if (people[i].getSalary() > highestIncome) {
                highestIncome = people[i].getSalary();
            }
        }
        return highestIncome;
    }

    public static String getGender(Person[] peopleToCheck) {
        int counter = 0;
        for (int i = 0; i < peopleToCheck.length; i++) {
            int lastNumber = Integer.parseInt(peopleToCheck[i].getSocialSecurityNumber().substring(10, 11));
            if (isEven(lastNumber)) {
                counter++;
            }
        }
        return "W tablicy znajdują się " + counter + " kobiety";
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

}

