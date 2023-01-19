public class Main {
    public static void main(String[] args) {
        task1();

        System.out.println();
        System.out.println();

        task2();

        System.out.println();
        System.out.println();

        task3();

        System.out.println();
        System.out.println();

        task4();

        System.out.println();
        System.out.println();

        task5();

        System.out.println();

        task6();

        System.out.println();
        System.out.println();

        task7();

        System.out.println();
        System.out.println();

        task8();

        System.out.println();

        task9();

        System.out.println();

        task10();
    }


    public static void task1() {
        System.out.println("Задание #1");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }

    public static void task2() {
        System.out.println("Задание #2");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }

    public static void task3() {
        System.out.println("Задание #3");
        for (int i = 0; i < 17; i++)
            if (i == 0) {
                continue;
            } else if (i % 2 == 0) {
                System.out.print(i + " ");
            }
    }

    public static void task4() {
        System.out.println("Задание #4");
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }
    }

    public static void task5() {

        System.out.println("Задание #5");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }
    }

    public static void task6() {
        System.out.println("Задание #6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
    }

    public static void task7() {
        System.out.println("Задание #7");
        for (int i = 1; i <= 512; i = i * 2)
            System.out.print(i + " ");
    }

    public static void task8() {
        System.out.println("Задача #8");
        int total = 0;
        int sumMoney = 29000;
        for (int i = 1; i <= 12; i++) {
            total += sumMoney;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task9() {
        System.out.println("Задача #9");
        int total = 0;
        int sumMoney = 29000;
        for (int i = 1; i <= 12; i++) {
            total = total + total / 100;
            total = total + sumMoney;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task10(){
        for(int i = 1; i <=9; i++){
            int num = 2 * i;
            System.out.println("2 * " + i + " = " + num);
        }
    }
}