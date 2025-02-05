package ru.ivannovr.lab1.task7;

import ru.ivannovr.Task;

import java.util.Scanner;

public class Task1_7 extends Task {
    public Task1_7() {
        super("1.7");
    }

    @Override
    public void execute() {
        this.printTaskHeader();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первую сторону прямоугольника: ");
        int a = scanner.nextInt();
        System.out.print("Введите вторую сторону прямоугольника: ");
        int b = scanner.nextInt();
        scanner.close();

        new Rectangle(a, b).printInfo();
    }
}
