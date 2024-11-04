package ru.otus.hw.l_15;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Employee {
    private final String name;
    private final int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static List<String> getNames(List<Employee> employees) {
//        List<String> names = new ArrayList<>(employees.size());
//        for (Employee emp : employees) {
//            names.add(emp.name);
//        }
//        return names;
        // =
        return employees.stream().map(emp -> emp.name).toList();
    }

    public static List<Employee> filterByAge(List<Employee> employees, int minAge) {
//        List<Employee> filteredList = new ArrayList<>();
//        for (Employee emp : employees) {
//            if (emp.age >= minAge) {
//                filteredList.add(emp);
//            }
//        }
//        return filteredList;
        // =
        return employees.stream().filter(emp -> emp.age >= minAge).toList();
    }

    public static boolean checkAvgAgeCorrespondence(List<Employee> employees, int minAvgAge) {
//        int empAge = 0;
//        for (Employee emp : employees) {
//            empAge += emp.age;
//        }
        // =
        int empAge = employees.stream().mapToInt(emp -> emp.age).sum();
        return (empAge / employees.size()) >= minAvgAge;
    }

    public static Employee getYoungest(List<Employee> employees) {
//        Employee youngest = employees.get(0); // = getFirst();
//        for (int i = 1; i < employees.size(); i++) {
//            if (employees.get(i).age < youngest.age) {
//                youngest = employees.get(i);
//            }
//        }
//        return youngest;
        // =
        return employees.stream().min(Comparator.comparing(Employee::getAge)).get();
    }
}
