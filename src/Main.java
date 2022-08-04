public class Main {
    public static void main(String[] args) {

        // Задание 1
        int dog = 7;
        byte cat = 1;
        short mouse = 3;
        long elephant = 110L;
        double sugarWeight = 4.5;
        float saltWeight = 1.5f;
        boolean dogIsAdult = dog > 10;
        char bar = 35;

        System.out.println(dogIsAdult);


        //Задание 2

        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weight0fAllBoxers = boxer1 + boxer2;
        double weightDifference = boxer2 - boxer1;
        System.out.println("Общий вес боксеров " + weight0fAllBoxers);
        System.out.println("Разница в весе боксеров " + weightDifference);


        // Задание 3
        int banana = 5;
        int bananaWeight = 80;
        int milk = 200 / 100;
        int milkWeight = 105;
        int IceCream = 2;
        int IceCreamWeight = 100;
        int egg = 4;
        int eggWeight = 70;
        int total = (banana * bananaWeight) + (milk * milkWeight) + (IceCream * IceCreamWeight) + (egg * eggWeight);
        int gramsInKg = 1000;

        double totalKgs = total / (gramsInKg * 1.0);
        System.out.println(totalKgs);


        // Задание 4

        int weight = 7;
        int gramInKg = 1000;
        int weightInGrams = weight * gramsInKg;

        int minGramsPerDay = 250;
        int maxGramsPerDay = 500;

        int minDays = weightInGrams / maxGramsPerDay;
        int maxDays = weightInGrams / minGramsPerDay;

        int avgDays = (minDays + maxDays) / 2;

        System.out.println("Min: " + minDays);
        System.out.println("Max: " + maxDays);
        System.out.println("Avg: " + avgDays);


        // Задача 5

        int percent = 10;
        double multiplier = percent / (100 * 1.);

        int mashaSalary = 67_760;
        int denisSalary = 83_690;
        int kristinaSalary = 76_230;

        int mashaNewSalary = (int) (mashaSalary + (mashaSalary * multiplier));
        int denisNewSalary = (int) (denisSalary + (denisSalary * multiplier));
        int kristinaNewSalary = (int) (kristinaSalary + (kristinaSalary * multiplier));

        int mashaDifference = (mashaNewSalary - mashaSalary) * 12;
        int denisDifference = (denisNewSalary - denisSalary) * 12;
        int kristinaDifference = (kristinaNewSalary - kristinaSalary) * 12;

        System.out.println("Маша теперь получает" + mashaNewSalary + " рублей. Годовой доход вырос на " + mashaDifference + "рублей");
        System.out.println("Денис теперь получает" + denisNewSalary + " рублей. Годовой доход вырос на " + denisDifference + "рублей");
        System.out.println("Кристина теперь получает" + kristinaNewSalary + " рублей. Годовой доход вырос на " + kristinaDifference + "рублей");


    }}