package ru.ivannovr.lab1.task3;

import ru.ivannovr.Main;
import ru.ivannovr.Task;

import java.util.Scanner;

public class Task1_3 extends Task {
    public Task1_3() {
        super("1.3");
    }

    @Override
    public void execute() {
        this.printTaskHeader();

        System.out.print("Введите имя человека: ");
        String name = Main.getScanner().next();
        System.out.print("Введите возраст человека: ");
        int age = Main.getScanner().nextInt();
        System.out.print("Введите рост человека: ");
        int height = Main.getScanner().nextInt();

        new Person(name, age, height).printResume();
    }
}
