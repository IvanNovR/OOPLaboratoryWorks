package ru.ivannovr.lab7.task2;

import ru.ivannovr.Task;

public class Task7_2 extends Task {
    public Task7_2() {
        super("7.2");
    }

    @Override
    public void execute() {
        this.printTaskHeader();
        new Spaceship().fly_obj();
        new Airplane().fly_obj();
        new Helicopter().fly_obj();
    }
}
