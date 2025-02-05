package ru.ivannovr.lab7.task1;

import ru.ivannovr.Task;

public class Task7_1 extends Task {
    public Task7_1() {
        super("7.1");
    }

    @Override
    public void execute() {
        this.printTaskHeader();
        new Dog().speak();
        new Cat().speak();
    }
}
