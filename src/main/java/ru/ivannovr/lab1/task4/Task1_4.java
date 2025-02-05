package ru.ivannovr.lab1.task4;

import ru.ivannovr.Task;

import java.util.Scanner;

public class Task1_4 extends Task {
    public Task1_4() {
        super("1.4");
    }

    @Override
    public void execute() {
        this.printTaskHeader();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текущий год: ");
        int year = scanner.nextInt();
        System.out.print("Введите возраст человека: ");
        int age = scanner.nextInt();
        scanner.close();

        this.printBirthdayYear(year, age);
    }

    public void printBirthdayYear(int currentYear, int age) {
        System.out.printf("Дата рождения - %d\n", currentYear - age);
    }
}
