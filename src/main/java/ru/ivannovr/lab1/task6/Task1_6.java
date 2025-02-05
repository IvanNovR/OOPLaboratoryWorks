package ru.ivannovr.lab1.task6;

import ru.ivannovr.Task;

public class Task1_6 extends Task {
    public Task1_6() {
        super("1.6");
    }

    @Override
    public void execute() {
        this.printTaskHeader();
        System.out.printf("%d + %d = %d\n", 11, 7, sum(11, 7));
        System.out.printf("%d - %d = %d\n", 11, 7, subtract(11, 7));
        System.out.printf("%d * %d = %d\n", 11, 7, multiply(11, 7));
        System.out.printf("%d / %d = %d\n", 11, 7, division(11, 7));
        System.out.printf("%d %% %d = %d\n", 11, 7, residueOfDivision(11, 7));
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
