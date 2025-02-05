package ru.ivannovr;

import ru.ivannovr.lab1.Lab1;
import ru.ivannovr.lab10.Lab10;
import ru.ivannovr.lab7.Lab7;

import java.util.Scanner;

public class Main {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        while (true) {
            int choice = selectLabProcess();
            switch (choice) {
                case 1 -> new Lab1().run();
                case 7 -> new Lab7().run();
                case 10 -> new Lab10().run();
                case 0 -> {
                    System.out.println("Выход...");
                    scanner.close();
                    return;
                }
            }
        }
    }

    public static int selectLabProcess() {
        System.out.println("--- Выберите лабораторную работу ---");
        System.out.println("1. Лабораторная работа #1");
        System.out.println("7. Лабораторная работа #7");
        System.out.println("10. Лабораторная работа #10");

        System.out.println("0. Выход");
        System.out.print("Введите выбор: ");
        return scanner.nextInt();
    }

    public static Scanner getScanner() {
        return scanner;
    }
}