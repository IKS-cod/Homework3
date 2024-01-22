public class Main {
    public static void main(String[] args) {
        //Задача 1. Объявите переменные типа int, byte, short, long, float, double.
        //
        //Название переменных может быть любым, но если состоит из двух слов и более, должно соответствовать правилу camelCase.
        //
        //Выведите в консоль значение каждой переменной в формате «Значение переменной … с типом … равно …».
        System.out.println("Задача 1.");
        byte cat = 1;
        System.out.println("Значение переменной cat с типом byte равно " + cat);
        short trees = 30000;
        System.out.println("Значение переменной trees с типом short равно " + trees);
        int  cars = 1000000000;
        System.out.println("Значение переменной cars с типом int равно " + cars);
        long sugar = 6000000000000000000L;
        System.out.println("Значение переменной sugar с типом long равно " + sugar);
        float apple = 1.5f;
        System.out.println("Значение переменной apple с типом float равно " + apple);
        double weight = 2.589;
        System.out.println("Значение переменной weight с типом double равно " + weight);

        //Задача 2
        //Ниже дан список различных значений. Инициализируйте переменные, используйте изученные ранее типы переменных.
        //
        //Значения:
        //
        //27.12
        //987 678 965 549
        //2,786
        //569
        //-159
        //27897
        //67
        System.out.println("Задача 2.");
        float a = 27.12f;
        System.out.println(a);
        long b = 98767896549L;
        System.out.println(b);
        float c = 2.786f;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        short e = -159;
        System.out.println(e);
        short f = 27897;
        System.out.println(f);
        byte g = 67;
        System.out.println(g);

        //Задача 3
        //Три школьных учителя, Людмила Павловна, Анна Сергеевна и Екатерина Андреевна, ведут три класса.
        //
        //У Людмилы Павловны — 23 ученика , у Анны Сергеевны — 27 учеников, у Екатерины Андреевны — 30 учеников.
        //
        //Три учительницы закупили все вместе 480 листов бумаги на все три класса. Посчитайте, сколько достанется листов каждому ученику.
        //
        //Результат задачи выведите в консоль в формате: «На каждого ученика рассчитано … листов бумаги».
        //
        //Для объявления переменных не используйте тип var.
        System.out.println("Задача 3.");
        byte studentsClassA = 23;
        byte studentsClassB = 27;
        byte studentsClassC = 30;
        short totalSheets = 480;

        //почему нельзя использовать byte при сложении?

        int totalStudents = studentsClassA + studentsClassB + studentsClassC;
        int sheetsOnOneStudent = totalSheets / totalStudents;
        System.out.println("На каждого ученика рассчитано " + sheetsOnOneStudent + " листов бумаги");

        //Задача 4
        //Производительность машины для изготовления бутылок — 16 бутылок за 2 минуты. Какая производительность машины будет:
        //
        //за 20 минут,
        //в сутки,
        //за 3 дня,
        //за 1 месяц?
        //Рассчитывайте производительность работы машины в том случае, если она работает без перерыва заданный промежуток времени.
        //
        //Результаты подсчетов выведите в консоль в формате: «За … машина произвела … штук бутылок».
        //
        //Для объявления переменных не используйте тип var.
        System.out.println("Задача 4.");
        byte bottlesInTwoMinutes = 16;
        int bottlesInOneMinutes = bottlesInTwoMinutes / 2;
        byte timeOneTwentyMinutes = 20;
        int bottlesInTwentyMinutes = bottlesInOneMinutes * timeOneTwentyMinutes;
        System.out.println("За 20 минут машина произвела " + bottlesInTwentyMinutes + " штук бутылок");
        byte timeTwoOneDay = 1;
        int totalMinutesInOneDay = timeTwoOneDay * 24 * 60;
        int bottlesInOneDay = bottlesInOneMinutes * totalMinutesInOneDay;
        System.out.println("За одни сутки машина произвела " + bottlesInOneDay + " штук бутылок");
        byte timeThreeThreeDay = 3;
        int bottlesInThreeDay = bottlesInOneDay * timeThreeThreeDay;
        System.out.println("За три дня машина произвела " + bottlesInThreeDay + " штук бутылок");
        byte timeFourOneMonth = 1;
        int dayInOneMonth = timeFourOneMonth * 30;
        int bottlesInOneMonth = bottlesInOneDay * dayInOneMonth;
        System.out.println("За один месяц машина произвела " + bottlesInOneMonth + " штук бутылок");

        //Задача 5
        //На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой. На один класс уходит 2 банки белой и 4 банки коричневой краски. Сколько банок каждой краски было куплено?
        //
        //Выведите результат задачи в консоль в формате: «В школе, где … классов, нужно … банок белой краски и … банок коричневой краски».
        //
        //Для объявления переменных не используйте тип var.
        System.out.println("Задача 5.");
        byte totalBanks = 120;
        byte banksWhitePaintOnOneClass = 2;
        byte banksBrownPaintOnOneClass = 4;
        int totalClasses = totalBanks / (banksWhitePaintOnOneClass + banksBrownPaintOnOneClass);
        int totalBanksWhitePaint = totalClasses * banksWhitePaintOnOneClass;
        int totalBanksBrownPaint = totalClasses * banksBrownPaintOnOneClass;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalBanksWhitePaint + " банок белой краски и " + totalBanksBrownPaint + " банок коричневой краски.");
         //Задача 6
        //Спортсмены следят за своим весом и тщательно относятся к тому, что и сколько они съедают.
        //
        //Вот один из рецептов, по которому спортсмен готовит себе завтрак:
        //
        // Бананы — 5 штук (1 банан — 80 грамм).
        // Молоко — 200 мл (100 мл = 105 грамм).
        // Мороженое-пломбир — 2 брикета по 100 грамм.
        // Яйца сырые – 4 яйца (1 яйцо — 70 грамм).
        //Смешать всё в блендере — и готово.
        //
        //Подсчитайте вес (количество граммов) такого спортзавтрака, а затем переведите его в килограммы.
        //
        //Результат в граммах и килограммах напечатайте в консоль.
        System.out.println("Задача 6.");
        int bananas = 5;
        byte weightOneBanana = 80;
        int totalWeightBananas = bananas * weightOneBanana;
        short milk = 200;
        short weight100mlMilk = 105;
        int totalWeightMilk = milk / 100 * weight100mlMilk;
        byte iceCream = 2;
        byte weightOneIceCream = 100;
        int totalWeightIceCream = iceCream * weightOneIceCream;
        byte eggs = 4;
        byte weightOneEgg = 70;
        int totalWeightEggs = eggs * weightOneEgg;
        int totalWeightBreakfastInGram = totalWeightBananas + totalWeightMilk + totalWeightIceCream + totalWeightEggs;
        float totalWeightBreakfastInKilogram = (float) totalWeightBreakfastInGram / 1000;
        System.out.println(totalWeightBreakfastInGram + "г");
        System.out.println(totalWeightBreakfastInKilogram + "кг");

        //Задача 7
        //Правила соревнований обновились, и спортсмену, чтобы оставаться в своей весовой категории, нужно сбросить 7 кг. Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.
        //
        //Посчитайте, сколько дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм, а сколько — если каждый день будет худеть на 500 грамм.
        //
        //Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.
        //
        //Результаты всех подсчетов выведите в консоль.
        System.out.println("Задача 7.");
        byte overweightAthlete = 7;
        int overweightAthleteInGram = overweightAthlete * 1000;
        short lossesOnFirstDietInGram = 250;
        short lossesOnSecondDietInGram = 500;
        float averageDiet = (float) (lossesOnFirstDietInGram + lossesOnSecondDietInGram) / 2;
        int dayOnDietFirst = overweightAthleteInGram / lossesOnFirstDietInGram;
        int dayOnDietSecond = overweightAthleteInGram / lossesOnSecondDietInGram;
        System.out.println(dayOnDietFirst);
        System.out.println(dayOnDietSecond);
        float dayOnDietAverage = (overweightAthleteInGram / averageDiet);
        System.out.println(dayOnDietAverage);

        //Задача 8
        //Представим, что мы работаем в большой компании, штат которой состоит из нескольких сотен сотрудников. В компании есть правило: чем дольше сотрудник работает в компании, тем ценнее он для бизнеса. Поэтому сотрудники, которые работают в компании дольше 3 лет, получают повышение зарплаты раз в год. Каждый год повышение составляет 10% от текущей зарплаты.
        //
        //К вам пришел руководитель с задачей автоматизировать повышение зарплаты, а также провести расчет для следующих сотрудников:
        //
        //Маша получает 67 760 рублей в месяц.
        //Денис получает 83 690 рублей в месяц.
        //Кристина получает 76 230 рублей в месяц.
        //Каждому нужно увеличить зарплату на 10% от текущей месячной. Дополнительно руководитель попросил посчитать разницу между годовым доходом с нынешней зарплатой и после повышения.
        //
        //Посчитайте, сколько будет получать каждый из сотрудников, а также разницу между годовым доходом до и после повышения.
        //
        //Выведите в консоль информацию по каждому сотруднику. Например: «Маша теперь получает ... рублей. Годовой доход вырос на ... рублей».
        System.out.println("Задача 8.");
        int salaryM = 67760;
        int salaryD = 83690;
        int salaryK = 76230;
        byte salaryIncrease = 10;
        int salaryIncreaseM = (salaryM * salaryIncrease / 100) + salaryM;
        int salaryIncreaseD = (salaryD * salaryIncrease / 100) + salaryD;
        int salaryIncreaseK = (salaryK * salaryIncrease / 100) + salaryK;
        int annualSalaryM_WithIncrease = salaryIncreaseM * 12;
        int annualSalaryD_WithIncrease = salaryIncreaseD * 12;
        int annualSalaryK_WithIncrease = salaryIncreaseK * 12;
        int annualSalaryM_WithoutIncrease = salaryM * 12;
        int annualSalaryD_WithoutIncrease = salaryD * 12;
        int annualSalaryK_WithoutIncrease = salaryK * 12;
        int salaryDifference_M = annualSalaryM_WithIncrease - annualSalaryM_WithoutIncrease;
        int salaryDifference_D = annualSalaryD_WithIncrease - annualSalaryD_WithoutIncrease;
        int salaryDifference_K = annualSalaryK_WithIncrease - annualSalaryK_WithoutIncrease;
        System.out.println("Маша теперь получает " + salaryIncreaseM + " рублей. Годовой доход вырос на " + salaryDifference_M + " рублей");
        System.out.println("Денис теперь получает " + salaryIncreaseD + " рублей. Годовой доход вырос на " + salaryDifference_D + " рублей");
        System.out.println("Кристина теперь получает " + salaryIncreaseK + " рублей. Годовой доход вырос на " + salaryDifference_K + " рублей");



















    }
}