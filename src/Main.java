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

        // Задача 5
        System.out.println("Задача 5");
        int totalJars = 120;
        int whiteJarsForOneClass = 2;
        int brounJarsForOneClass = 4;
        int totalClasses = totalJars / (whiteJarsForOneClass + brounJarsForOneClass);
        int totalWhiteJars = totalClasses * whiteJarsForOneClass;
        int totalBrounJars = totalClasses * brounJarsForOneClass;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhiteJars + " банок белой краски и " + totalBrounJars + " банок коричневой краски");

        // Задача 6
        System.out.println("Задача 6");
        int bananasWeight = 5 * 80;
        int milkWeight = 105 * 2;
        int icecreamWeight = 100 * 2;
        int eggsWeight = 4* 70;
        int breakfastWeightInGramm = bananasWeight + milkWeight + icecreamWeight + eggsWeight;
        float breakfastWeightInKilogramm = breakfastWeightInGramm / (float) 1000;
        System.out.println(breakfastWeightInGramm);

        // Задача 7
        System.out.println("Задача 7");
        int loseWeight = 7000;
        int firstOption = 250;
        int secondOption = 500;
        int totalFirstOption = loseWeight / firstOption;
        int totalSecondOption = loseWeight / secondOption;
        System.out.println("Если спортсмен будет терять по " + firstOption + " грамм в день, то ему понадобится " + totalFirstOption + " дней");
        System.out.println("Если спортсмен будет терять по " + secondOption + " грамм в день, то ему понадобится " + totalSecondOption + " дней");
        System.out.println("В среднем для похудения спортсмену понадобится " + (totalFirstOption + totalSecondOption) / 2 + " день" );

        // Задача 8
        System.out.println(" Задача 8 ");
        var masha = 67760;
        var denis = 83690;
        var kristina = 76230;
        var mashaNewSalary = masha * 1.1;
        var denisNewSalary = denis * 1.1;
        var kristinaNewSalary = kristina * 1.1;
        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + (mashaNewSalary-masha) + " рублей");
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + (denisNewSalary-denis) + " рублей");
        System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос на " + (kristinaNewSalary-kristina) + " рублей");



        


        



    }
}