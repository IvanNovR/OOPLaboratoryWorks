package ru.ivannovr.lab7.task3;

public class Employee {
    private final String name;

    public Employee(String name) {
        this.name = name;
    }

    public void voice() {
        System.out.printf("Меня зовут %s. ", name);
    }
}
