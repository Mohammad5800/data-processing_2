package com.pluralsight.loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        people.add(new Person("John", "Smith", 25));
        people.add(new Person("Mary", "Jones", 30));
        people.add(new Person("David", "Brown", 40));
        people.add(new Person("Sarah", "Wilson", 22));
        people.add(new Person("James", "Taylor", 35));
        people.add(new Person("Emma", "Davis", 28));
        people.add(new Person("Michael", "Clark", 50));
        people.add(new Person("Sophia", "Hall", 19));
        people.add(new Person("Daniel", "Allen", 45));
        people.add(new Person("Olivia", "Young", 32));

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a name to search: ");
        String searchName = scanner.nextLine();

        List<Person> matches = new ArrayList<>();

        for (Person person : people) {

            if (person.getFirstName().equalsIgnoreCase(searchName)
                    || person.getLastName().equalsIgnoreCase(searchName)) {

                matches.add(person);
            }
        }

        System.out.println("\nMatches:");

        if (matches.isEmpty()) {
            System.out.println("No matches found.");
        } else {

            for (Person person : matches) {
                System.out.println(
                        person.getFirstName()
                                + " "
                                + person.getLastName()
                                + " Age: "
                                + person.getAge());
            }
        }

        int totalAge = 0;
        int oldest = people.get(0).getAge();
        int youngest = people.get(0).getAge();

        for (Person person : people) {

            totalAge += person.getAge();

            if (person.getAge() > oldest) {
                oldest = person.getAge();
            }

            if (person.getAge() < youngest) {
                youngest = person.getAge();
            }
        }

        double averageAge = (double) totalAge / people.size();

        System.out.println("\nAverage Age: " + averageAge);
        System.out.println("Oldest Age: " + oldest);
        System.out.println("Youngest Age: " + youngest);

        scanner.close();
    }
}