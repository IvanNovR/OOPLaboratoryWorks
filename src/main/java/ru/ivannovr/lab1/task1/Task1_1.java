package ru.ivannovr.lab1.task1;

import ru.ivannovr.Task;

public class Task1_1 extends Task {
    public Task1_1() {
        super("1.1");
    }

    @Override
    public void execute() {
        this.printTaskHeader();
        this.printPoem();
    }

    private void printPoem() {
        /*
        Я помню чудное мгновение
        Передо мной явилась ты
        Как мимолетное видение
        Как гений чистой красоты!
         */
        System.out.println("Я помню чудное мгновение");
        System.out.println("Передо мной явилась ты");
        System.out.println("Как мимолетное видение");
        System.out.println("Как гений чистой красоты!");
    }
}
