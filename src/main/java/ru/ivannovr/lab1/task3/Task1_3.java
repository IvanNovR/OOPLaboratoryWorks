package ru.ivannovr.lab1.task3;

import ru.ivannovr.Task;

import java.util.Scanner;

public class Task1_3 extends Task {
    public Task1_3() {
        super("1.3");
    }

    @Override
    public void execute() {
        this.printTaskHeader();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя человека: ");
        String name = scanner.next();
        System.out.print("Введите возраст человека: ");
        int age = scanner.nextInt();
        System.out.print("Введите рост человека: ");
        int height = scanner.nextInt();
        scanner.close();

        new Person("Иван", age, height).printResume();
    }
}
