public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Task 1");
        int clientOS = 0;
        switch (clientOS) {
            case 0: System.out.println("Установите версию приложения для iOS по ссылке\n"); break;
            case 1: System.out.println("Установите версию приложения для Android по ссылке\n"); break;
            default: System.out.println();
        }

        // Task 2
        System.out.println("Task 2");
        int clientDeviceYear = 2015;

        if (clientDeviceYear > 2015) {
            switch (clientOS) {
                case 0: System.out.println("Установите версию приложения для iOS по ссылке\n"); break;
                case 1: System.out.println("Установите версию приложения для Android по ссылке\n"); break;
                default: System.out.println();
            }
        } else {
            switch (clientOS) {
                case 0: System.out.println("Установите облегченную версию приложения для iOS по ссылке\n"); break;
                case 1: System.out.println("Установите облегченную версию приложения для Android по ссылке\n"); break;
                default: System.out.println();
            }
        }

        // Task 3
        System.out.println("Task 3");
        int currentYear = 2021;
        if (currentYear >= 1584 && ( (currentYear % 4 == 0 && currentYear % 100 != 0) || currentYear % 400 == 0) ) {
            System.out.printf("%s год является високосным\n", currentYear);
        } else {
            System.out.printf("%s год не является високосным\n", currentYear);
        };
        System.out.println();

        // Task 4
        System.out.println("Task 4");
        int deliveryDistance = 95;
        int deliveryDays = 1;

        if (deliveryDistance < 20) {
            System.out.printf("Потребуется дней: %s\n", deliveryDays);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryDays++;
            System.out.printf("Потребуется дней: %s\n", deliveryDays);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            deliveryDays += 2;
            System.out.printf("Потребуется дней: %s\n", deliveryDays);
        } else {
            System.out.println("Доставки нет");
        }
        System.out.println();

        // Task 5
        System.out.println("Task 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12, 1, 2   -> System.out.println("Это зима");
            case 3, 4, 5    -> System.out.println("Это весна");
            case 6, 7, 8    -> System.out.println("Это лето");
            case 9, 10, 11  -> System.out.println("Это осень");
            default         -> System.out.println("Неправильный месяц");

        }
    }
}