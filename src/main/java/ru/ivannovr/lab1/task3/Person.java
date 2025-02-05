package ru.ivannovr.lab1.task3;

public class Person {
    private String name;
    private int age;
    private int height;

    protected Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void printResume() {
        System.out.printf(
                "Здравствуйте, меня зовут %s, мне %d лет. Мой рост составляет %dсм\n",
                this.name, this.age, this.height
        );
    }
}
