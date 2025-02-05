package ru.ivannovr.lab1.task6;

import ru.ivannovr.Main;
import ru.ivannovr.Task;

import java.util.Scanner;

public class Task1_6 extends Task {
    public Task1_6() {
        super("1.6");
    }

    @Override
    public void execute() {
        this.printTaskHeader();

        System.out.print("Введите первый операнд: ");
        int a = Main.getScanner().nextInt();
        System.out.print("Введите второй операнд: ");
        int b = Main.getScanner().nextInt();

        System.out.printf("%d + %d = %d\n", a, b, sum(a, b));
        System.out.printf("%d - %d = %d\n", a, b, subtract(a, b));
        System.out.printf("%d * %d = %d\n", a, b, multiply(a, b));
        System.out.printf("%d / %d = %d\n", a, b, division(a, b));
        System.out.printf("%d %% %d = %d\n", a, b, residueOfDivision(a, b));
    }

    private int sum(int a, int b) {
        return a + b;
    }

    private int subtract(int a, int b) {
        return a - b;
    }

    private int multiply(int a, int b) {
        return a * b;
    }

    private int division(int a, int b) {
        return a / b;
    }

    private int residueOfDivision(int a, int b) {
        return a % b;
    }
}
