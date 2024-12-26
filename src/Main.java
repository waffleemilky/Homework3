public class Main {
    public static void main(String[] args) {

        int a = 1;
        System.out.println("Значение переменной a с типом int равно " + a);
        byte b = 1;
        System.out.println("Значение переменной b с типом byte равно " + b);
        short c = 1;
        System.out.println("Значение переменной c с типом short равно " + c);
        long d = 1L;
        System.out.println("Значение переменной d с типом long равно " + d);
        float e = 1f;
        System.out.println("Значение переменной e с типом float равно " + e);
        double f = 1f;
        System.out.println("Значение переменной f с типом double равно " + f);

        float g = 27.12f;
        long h = 987678965549L;
        double i = 2.786f;
        short j = 569;
        short k = -159;
        short l = 27897;
        byte m = 67;

        byte ludaClass = 23;
        byte annaClass = 27;
        byte katyClass = 30;
        short paperAll = 480;
        int allKids = ludaClass + annaClass + katyClass;
        int paperKids = paperAll / allKids;
        System.out.println("На каждого ученика рассчитано " + paperKids + " листов бумаги");

        byte bottles = 16;
        byte minutes = 10;
        int machine20 = bottles * minutes;
        System.out.println("За 20 минут машина произвела " + machine20 + " штук бутылок");
        short day = 720;
        int machineDay = bottles * day;
        System.out.println("За сутки машина произвела " + machineDay + " штук бутылок");
        short day3 = 2160;
        int machineDay3 = bottles * day3;
        System.out.println("За 3 дня машина произвела " + machineDay3 + " штук бутылок");
        int month = 21900;
        int machineMonth = bottles * month;
        System.out.println("За месяц машина произвела " + machineMonth + " штук бутылок");

        byte allPaints = 120;
        byte white = 2;
        byte brown = 4;
        int oneClass = white + brown;
        int allClass = allPaints / oneClass;
        int allWhite = white * allClass;
        int allBrown = brown * allClass;
        System.out.println("В школе, где " + allClass + " классов, нужно " +allWhite + " банок белой краски и " + allBrown + " банок коричневой краски");

        byte banana = 80;
        byte milk = 105;
        byte iceCream = 100;
        byte egg = 70;
        int recipeGram = (banana * 5) + (milk * 2) + (iceCream * 2) + (egg * 4);
        System.out.println("Вес спортзавтрака " + recipeGram + " грамм");
        float recipeKg = recipeGram / 1000f;
        System.out.println("Вес спортзавтрака " + recipeKg + " кг");

        byte needWeight = 7;
        int needWeightGram = needWeight * 1000;
        short minusWeight250 = 250;
        short minusWeight500 = 500;
        int days250 = needWeightGram / minusWeight250;
        System.out.println("В среднем нужно " + days250 + " дней для похудения, если терять каждый день по 250г");
        int days500 = needWeightGram / minusWeight500;
        System.out.println("В среднем нужно " + days500 + " дней для похудения, если терять каждый день по 500г");

        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int year = 12;
        float mashaPlus = masha + (masha * (10f / 100f));
        float denisPlus = denis + (denis * (10f / 100f));
        float kristinaPlus = kristina + (kristina * (10f / 100f));
        int lastPayM = masha * year;
        int lastPayD = denis * year;
        int lastPayK = kristina * year;
        float newPayM = mashaPlus * year;
        float newPayD = denisPlus * year;
        float newPayK = kristinaPlus * year;
        float differencePayM = newPayM - lastPayM;
        float differencePayD = newPayD - lastPayD;
        float differencePayK = newPayK - lastPayK;
        System.out.println("Маша теперь получает " + mashaPlus + " рублей в месяц. Годовой доход вырос на " + differencePayM + " рублей.");
        System.out.println("Денис теперь получает " + denisPlus + " рублей в месяц. Годовой доход вырос на " + differencePayD + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaPlus + " рублей в месяц. Годовой доход вырос на " + differencePayK + " рублей.");

    }
}