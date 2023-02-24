package pl.kurs.excercise3.app;

import pl.kurs.excercise3.model.Employee;
import pl.kurs.excercise3.model.Person;
import pl.kurs.excercise3.model.Student;
import pl.kurs.excercise3.service.PersonService;

import java.util.Arrays;

public class PersonRunner {
    public static void main(String[] args) {

        Person person1 = new Employee("Tomasz", "Nowak", "12345678901", "Kraków", "informatyk", 10000);
        Person person2 = new Employee("Mariusz", "Kowalski", "12345678903", "Sosnowiec", "księgowy", 4000);
        Person person3 = new Employee("Katarzyna", "Kowalczyk", "12345678902", "Rzeszów", "przedstawiciel handlowy",
                3000);
        Person person4 = new Student("Michał", "Madczak", "12345678907", "Warszawa", "prawo", 15000);
        Person person5 = new Student("Grzegorz", "Brzęczyszczykiewicz", "12345678909", "Łódź", "architektura",
                500); //:')
        Person person6 = new Student("Justyna", "Sypczak", "12345678906", "Łódź", "historia",
                400);

        Person[] persons = {person1, person2, person3, person4, person5, person6};

        System.out.println(Arrays.toString(persons));
        System.out.println();
        System.out.println("Najwieksza dochód: " + PersonService.getHighestIncome(persons));
        System.out.println(PersonService.getGender(persons));
    }
}
