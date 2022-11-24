public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задание 1");
        byte mango = 4;
        short apple = 10000;
        int orange = 85;
        long bananas = 108;
        float grape = 3.5F;
        double cucumber = 15.7;
        System.out.println("Значение переменной mango с типом byte равно " + mango);
        System.out.println("Значение переменной apple с типом short равно " + apple);
        System.out.println("Значение переменной orange с типом int равно " + orange);
        System.out.println("Значение переменной bananas с типом long равно " + bananas);
        System.out.println("Значение переменной grape с типом float равно " + grape);
        System.out.println("Значение переменной cucumber с типом double равно " + cucumber);

        // Задача 2
        System.out.println("Задание 2");
        float red = 27.12f;
        long green = 987_678_965_549l;
        double grey = 2.786;
        boolean catInBox = false;
        char yellow = 569;
        short pink = -159;
        int black = 27897;
        byte white = 67;

        // Задача 3
        System.out.println("Задача 3");
        int Lp = 23;
        int As = 27;
        int Ea = 30;
        int TotalStudents = Lp + As + Ea;
        int TotalPaper = 480;
        int Paper = TotalPaper / TotalStudents;
        System.out.println("На каждого ученика рассчитано " + Paper + " листов бумаги");

        // Задача 4
        System.out.println("Задача 4");
        int Perfomance2Minute = 16;
        int Perfomance1Minute = Perfomance2Minute / 2;
        int min20 = Perfomance1Minute * 20;
        System.out.println("За 20 минут машина произвела бутылок " + min20 + " штук");
        int day = Perfomance1Minute * 1440;
        System.out.println("За сутки машина произвела бутылок " + day + " штук");
        System.out.println("За 3 суток машина произвела бутылок " + day * 3 + " штук");
        System.out.println("За месяц машина произвела бутылок " + day * 30 + " штук");


        



    }
}