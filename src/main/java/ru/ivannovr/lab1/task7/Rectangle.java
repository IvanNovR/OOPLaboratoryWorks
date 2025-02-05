package ru.ivannovr.lab1.task7;

public class Rectangle {
    private final int a;
    private final int b;
    protected Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void printInfo() {
        System.out.printf("Информация о прямоугольнике со сторонами %d и %d:\n", this.a, this.b);
        System.out.printf("Площадь прямоугольника = %d\n", getSquare());
        System.out.printf("Периметр прямоугольника = %d\n", getPerimeter());
    }

    public int getSquare() {
        return a * b;
    }

    public int getPerimeter() {
        return (a + b) * 2;
    }
}
