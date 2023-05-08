package part2;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите день недели:");
        int dayOfWeek = sc.nextInt();
        switch (dayOfWeek) {
            case 1:
                System.out.println("Понедельник: курсы");
                break;
            case 2:
                System.out.println("Вторник: футзал");
                break;
            case 3:
                System.out.println("Среда: ремонт машины");
                break;
            case 4:
                System.out.println("Четверг: курсы");
                break;
            case 5:
                System.out.println("Пятница: ночной клуб");
                break;
            case 6:
                System.out.println("Отдых после пятницы");
                break;
            case 7:
                System.out.println("Выходной день");
                break;
            default:
                System.out.println("Некорректный номер дня недели");
        }
    }
}