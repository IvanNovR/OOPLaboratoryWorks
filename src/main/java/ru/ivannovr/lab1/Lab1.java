package ru.ivannovr.lab1;

import ru.ivannovr.Lab;
import ru.ivannovr.lab1.task1.Task1_1;
import ru.ivannovr.lab1.task2.Task1_2;
import ru.ivannovr.lab1.task3.Task1_3;
import ru.ivannovr.lab1.task4.Task1_4;
import ru.ivannovr.lab1.task5.Task1_5;
import ru.ivannovr.lab1.task6.Task1_6;
import ru.ivannovr.lab1.task7.Task1_7;

public class Lab1 implements Lab {
    public Lab1() {

    }

    public void run() {
        new Task1_1().execute();
        new Task1_2().execute();
        new Task1_3().execute();
        new Task1_4().execute();
        new Task1_5().execute();
        new Task1_6().execute();
        new Task1_7().execute();
    }
}
