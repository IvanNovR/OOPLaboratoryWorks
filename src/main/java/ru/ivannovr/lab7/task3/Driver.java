package ru.ivannovr.lab7.task3;

public class Driver extends Employee implements AbleDriving {
    public Driver(String name) {
        super(name);
    }

    @Override
    public void driveCar() {
        System.out.println("Я умею водить машину!");
    }
}
