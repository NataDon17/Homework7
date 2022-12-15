public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        // Пишем код для задачи 1
        int accumulation = 15000;
        int total = 0;
        int i = 0;
        while (total < 2459000) {
            total = total + total / 100;
            total = total + accumulation;
            i = i + 1;
        }
        System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
    }

    public static void task2() {
        System.out.println("Задача 2");
        // Пишем код для задачи 2
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(i + " ");
        }
        System.out.println();
        for (int j = 10; j > 0; j--) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        // Пишем код для задачи 3
        int populationY = 12000000;
        int birthrateY = populationY * 17 / 1000;
        int mortalityY = populationY * 8 / 1000;
        int annualPopulationGrowthY = 0;
        for (int i = 1; i <= 10; i++) {
            annualPopulationGrowthY = birthrateY - mortalityY;
            populationY = populationY + annualPopulationGrowthY;
            System.out.println("Год " + i + ", численность населения составляет " + populationY + " человек.");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        // Пишем код для задачи 4
        int accumulation = 15000;
        int total = 0;
        int i = 0;
        while (total < 120000000) {
            total = accumulation + accumulation * 7 / 100;
            accumulation = total;
            System.out.println(total);
            i = i + 1;
        }
        System.out.println("Месяцев " + i + ", сумма накоплений равна " + total + " рублей.");
    }

    public static void task5() {
        System.out.println("Задача 5");
        // Пишем код для задачи 5
        int accumulation = 15000;
        int total = 0;
        int i = 0;
        for (; total < 120000000; i++) {
            total = accumulation + accumulation * 7 / 100;
            accumulation = total;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
            }
        }
        System.out.println("Месяцев " + i + ", сумма накоплений равна " + total + " рублей.");
    }

    public static void task6() {
        System.out.println("Задача 6");
        // Пишем код для задачи 6
        int accumulation = 15000;
        int total = 0;
        int i = 0;
        for (; i <= 216; i++) {
            total = accumulation + accumulation * 7 / 100;
            accumulation = total;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
            }
        }
        System.out.println("Месяцев " + i + ", сумма накоплений равна " + total + " рублей.");
    }

    public static void task7() {
        System.out.println("Задача 7");
        // Пишем код для задачи 7
        int fridayNumber = 2;
        for (; fridayNumber <= 31; fridayNumber = fridayNumber + 7) {
            System.out.println("Сегодня пятница, " + fridayNumber + "-е число. Необходимо подготовить отчет.");
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        // Пишем код для задачи 8
        int yearToday = 2022;
        int yearPast = yearToday - 200;
        int yearFuture = yearToday + 100;
        for (int yearComet = yearPast; yearComet <= yearFuture; yearComet++) {
            if (yearComet % 79 == 0) {
                System.out.println(yearComet);
            }
        }
    }
}

