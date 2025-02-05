package ru.ivannovr.lab1.task5;

import ru.ivannovr.Task;

import java.util.Scanner;

public class Task1_5 extends Task {
    public Task1_5() {
        super("1.5");
    }

    @Override
    public void execute() {
        this.printTaskHeader();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кол-во дней: ");
        int days = scanner.nextInt();
        scanner.close();

        this.printDaysStatistic(days);
    }

    private void printDaysStatistic(int days) {
        System.out.printf("В %d днях:\n", days);
        System.out.printf("%d полных месяцев\n", calculateMonths(days));
        System.out.printf("%d полных лет\n", calculateYears(days));
    }

    private int calculateMonths(int days) {
        return days / 30;
    }

    private int calculateYears(int days) {
        return days / 365;
    }
}
