package ru.ivannovr.lab1.task2;

import ru.ivannovr.Task;

public class Task1_2 extends Task {
    private int intNumber;
    private double doubleNumber;
    private String str;
    private char character;
    private boolean bool;

    public Task1_2() {
        super("1.2");
    }

    @Override
    public void execute() {
        this.printTaskHeader();
        this.initializeVariables();
        this.printVariables();
    }

    public void initializeVariables() {
        this.intNumber = 12321;
        this.doubleNumber = 345.543;
        this.str = "Иван";
        this.character = 'z';
        this.bool = false;
    }

    public void initializeVariables(int intNumber, double doubleNumber, String str, char character, boolean bool) {
        this.intNumber = intNumber;
        this.doubleNumber = doubleNumber;
        this.str = str;
        this.character = character;
        this.bool = bool;
    }

    public void printVariables() {
        System.out.printf("Значение целочисленной переменной - %d\n", this.intNumber);
        System.out.printf("Значение переменной двойной точности - %f\n", this.doubleNumber);
        System.out.printf("Значение строковой переменной - %s\n", this.str);
        System.out.printf("Значение символьной переменной - %c\n", this.character);
        System.out.printf("Значение логической переменной - %b\n", this.bool);
    }
}
