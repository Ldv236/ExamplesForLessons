package org.scanners;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inNumber;

        while (true) {
            try {
                System.out.println("Введите число в консоли: ");
                inNumber = scanner.nextInt();
                System.out.println("Умножаем ваше число на 2 - " + inNumber * 2);
                break; // Если нужно выйти из цикла после успешного ввода
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели не число. Пожалуйста, попробуйте снова.");
                scanner.nextLine(); // Очистка буфера сканера от некорректного ввода
            }
        }
        scanner.close(); // Закрытие сканера после использования
    }
}