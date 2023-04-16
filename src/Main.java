public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке»");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2013;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
        if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int year = 2020;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год является высокосным");
        } else {
            System.out.println("Год не является высокосным");
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 19;
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        System.out.println("Потребуется дней для доставки: " + deliveryDays);

        }
    public static void task5() {
        System.out.println("Задача 5");
        int monthYear = 13;
        switch (monthYear) {
            case 1:
            case 2:
            case 12:
                System.out.println("Время года - зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Время года - весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Время года - лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Время года - осень");
                break;
            default:
                System.out.println("Такого дня не существует");
        }
    }
}