package ru.ivannovr.lab1.task4;

import ru.ivannovr.Task;

public class Task1_4 extends Task {
    public Task1_4() {
        super("1.4");
    }

    @Override
    public void execute() {
        this.printTaskHeader();
        this.printBirthdayYear(2023, 8);
    }

    public void printBirthdayYear(int currentYear, int age) {
        System.out.printf("Дата рождения - %d\n", currentYear - age);
    }
}
