package homework;

public class Main {


    public static void main(String[] args) {
        checkLeapYear(2015);
        checkApplicationVersion(1, 2020);

        int distance = 110;
        printDeliveryDays(distance);
    }


    private static void checkLeapYear(int year) {
        System.out.println("\nЗадача_1");

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является высокосным");
        } else {
            System.out.println(year + " год не является высокосным");
        }
    }

    public static void checkApplicationVersion(int clientOS, int clientDeviceYear) {
        System.out.println("\nЗадача_2");

        int year = 2022;

        if (clientOS == 0) {
            if (clientDeviceYear < 2022) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (clientOS == 1) {
                if (clientDeviceYear < 2022) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
            }
        }
    }


    public static int calculateDeliveryDays(int deliveryDistance) {
        System.out.println("\nЗадача_3");

        int deliveryDays;

        if (deliveryDistance < 20) {
            deliveryDays = 1;
        } else if (deliveryDistance < 60) {
            deliveryDays = 2;
        } else if (deliveryDistance < 100) {
            deliveryDays = 3;
        } else {
            deliveryDays = 0;

        }

        return deliveryDays;
    }

    public static void printDeliveryDays(int deliveryDistance) {
        if (deliveryDistance > 100) {
            System.out.println(" Нет доставки ");
        } else {
            System.out.println("Потребуется дней " + calculateDeliveryDays(deliveryDistance));
        }
    }
}


