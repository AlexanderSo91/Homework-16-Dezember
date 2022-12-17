package homework;

public class Main {
    public static void main(String[] args) {

            task1();
            task2();
            task3();

        }



        public static void task1() {



            System.out.println("\nЗадача_1");
            public static void main(String[] args)
            {
                LocalDate today = LocalDate.now();
                if(today.isLeapYear())
                {
                    System.out.println("This year is Leap year");
                }
                else
                {
                    System.out.println("This year is not a Leap year");
                }
            }
        }



            int year = 2021;


        assert year >= 1583;
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);

    }





    public static void task2() {

        System.out.println("\nЗадача_2");

        int clientOS = 20;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");

        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Выберите вашу версию приложения");
        }
    }


    public static void task3() {

        System.out.println("\nЗадача_3");
        int deliveryDistance = 130;
        if (deliveryDistance <20) {
            System.out.println("На доставку "+ deliveryDistance + " км потребуются 1 сутки");
        } else if (deliveryDistance >20 && deliveryDistance <60){
            System.out.println("На доставку "+ deliveryDistance + " км потребуются 2 суток");
        } else if (deliveryDistance >60 && deliveryDistance <100){
            System.out.println("На доставку "+ deliveryDistance + " км потребуются 3 суток");
        } else
            System.out.println("Нет доставки");
    }
}

