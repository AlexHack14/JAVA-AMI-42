package ua.edu.lnu.task.createclass;

import java.util.Arrays;

/**
 * Створити клас на основі заданої у відповідному варіанті предметної області, який містить 3 або 4 private-поля.
 * Визначити усі конструктори (за замовчуванням, з параметрами і копіювання), методи введення та виведення на екран,
 * методи доступу до полів класу, додати власний метод класу.
 * Створити масив з об’єктів класу. За допомогою створеного меню продемонструвати результати виконання методів для
 * кожного елемента масиву. Вивести всі об’єкти, які задовольняють певну умову (придумати самостійно).
 * Номер варіанту визначається номером у списку в журналі.
 */
public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer();
        computer1.setName("Samsung");
        computer1.setModel("RX-1000");
        computer1.setPrice(2222.3);
        Computer computer2 = new Computer("HP", "PK-400", 2345.6);
        Computer computer3 = new Computer(computer1);
        computer3.setModel("RX-1300");
        Computer computer4 = new Computer("Apple", "ProBook", 3000.2);
        Computer computer5 = new Computer(computer4);
        computer5.setPrice(2500.22);
        Computer[] computers = {computer1, computer2, computer3, computer4, computer5};

        filterStreamAPI(2500, 3001, computers);
    }

    public static void filter(int startingPrice, int finalPrice, Computer[] computers) {

        for (Computer computer : computers) {
            if (computer.getPrice() >= startingPrice && computer.getPrice() <= finalPrice) {
                computer.showDetails();
                System.out.println("---------------------");
            }
        }
    }

    public static void filterStreamAPI(int startingPrice, int finalPrice, Computer[] computers) {
        Arrays.stream(computers)
                .filter(computer -> computer.getPrice() >= startingPrice && computer.getPrice() <= finalPrice)
                .forEach(computer -> {
                    computer.showDetails();
                    System.out.println("---------------------");
                });
    }
}
