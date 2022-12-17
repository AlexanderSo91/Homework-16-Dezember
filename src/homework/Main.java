package homework;

public class Main {


    public static void main(String[] args) {
        checkLeapYear(2015);
        applicationVersion(1,2015);
        bankCardDelivery(30);
    }


    private static void checkLeapYear(int year) {
        System.out.println("\nЗадача_1");

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является высокосным");
        } else {
            System.out.println(year + " год не является высокосным");
        }
    }

    public static void applicationVersion(int clientOS,int clientDeviceYear) {
        System.out.println("\nЗадача_2");

        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (clientOS == 1) {
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
            }
        }
    }


    public static void bankCardDelivery (int deliveryDistance) {
        System.out.println("\nЗадача_3");

        if (deliveryDistance < 20) {
            System.out.println("На доставку " + deliveryDistance + " км потребуются 1 сутки");
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("На доставку " + deliveryDistance + " км потребуются 2 суток");
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("На доставку " + deliveryDistance + " км потребуются 3 суток");
        } else
            System.out.println("Нет доставки");
    }
}

