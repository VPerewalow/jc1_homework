package part2;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите день недели:");
        int x = sc.nextInt();
        if (x == 1) {
            System.out.println("Понедельник. Работа.");
        } else if (x == 2) {
            System.out.println("Вторник. Встреча с друзьями.");
        } else if (x == 3) {
            System.out.println("Среда. Поездка к родителям.");
        } else if (x == 4) {
            System.out.println("Четверг. Тренажёрный зал.");
        } else if (x == 5) {
            System.out.println("Пятница. Совещание.");
        } else if (x == 6) {
            System.out.println("Суббота. Ночной клуб.");
        } else if (x == 7) {
            System.out.println("Воскресенье. Отдых.");
        } else {
            System.out.println("Некорректный ввод");
        }
    }
}