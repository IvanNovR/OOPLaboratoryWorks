package ru.ivannovr.lab7.task3;

import ru.ivannovr.Task;

public class Task7_3 extends Task {
    public Task7_3() {
        super("7.3");
    }

    @Override
    public void execute() {
        this.printTaskHeader();
        Programmer programmer = new Programmer("Иван");
        programmer.voice();
        programmer.writeCode();

        Driver driver = new Driver("Никита");
        driver.voice();
        driver.driveCar();

        Chef chef = new Chef("Макар");
        chef.voice();
        chef.cookDish();
    }
}
