package ru.ivannovr.lab1.task3;

import ru.ivannovr.Task;

public class Task1_3 extends Task {
    public Task1_3() {
        super("1.3");
    }

    @Override
    public void execute() {
        this.printTaskHeader();
        new Person("Иван", 19, 176).printResume();
    }
}
