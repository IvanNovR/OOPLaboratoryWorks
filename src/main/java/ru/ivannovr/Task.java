package ru.ivannovr;

public class Task {
    private final String taskName;

    public Task(String name) {
        this.taskName = name;
    }

    public void printTaskHeader() {
        System.out.printf("--- Задание %s ---\n", this.taskName);
    }

    public void execute() {
        this.printTaskHeader();
    }
}
