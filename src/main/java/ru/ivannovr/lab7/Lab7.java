package ru.ivannovr.lab7;

import ru.ivannovr.Lab;
import ru.ivannovr.lab7.task1.Task7_1;
import ru.ivannovr.lab7.task2.Task7_2;
import ru.ivannovr.lab7.task3.Task7_3;

public class Lab7 implements Lab {
    public void run() {
        new Task7_1().execute();
        new Task7_2().execute();
        new Task7_3().execute();
    }
}
