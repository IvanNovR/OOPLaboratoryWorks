package ru.ivannovr.lab7.task3;

public class Chef extends Employee implements AbleCooking {
    public Chef(String name) {
        super(name);
    }

    @Override
    public void cookDish() {
        System.out.println("Я умею готовить блюда!");
    }
}
