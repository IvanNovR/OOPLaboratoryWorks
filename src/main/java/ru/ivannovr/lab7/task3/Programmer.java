package ru.ivannovr.lab7.task3;

public class Programmer extends Employee implements AbleProgramming {
    public Programmer(String name) {
        super(name);
    }

    @Override
    public void writeCode() {
        System.out.println("Я умею писать код!");
    }
}
