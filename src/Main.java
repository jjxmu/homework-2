//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Задача 2
        //-159, 2.786, 27.12, 67, 569, 27897, 987678965549
       short s = -159;
       double d = 2.786;
       float f = 27.12F;
       byte b = 67;
       short s2 = 569;
       int i = 27897;
       long l = 987678965549L;

        //Задача 3
        byte annaPavlovnaStudent = 23;
        byte annaSergeevnaStudent = 27;
        byte ekaterinaAndreevnaStudent = 30;

        short paper = 480;
        int paperPerStudent = paper/(annaPavlovnaStudent + annaSergeevnaStudent + ekaterinaAndreevnaStudent);

        System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги.");

        //Задача 4
        byte machineEfficiencyPerMinute = 16 / 2;
        byte tMinute = 1;
        int tTwentyMinutes = tMinute * 20;
        int machineEfficiencyPerTwentyMinutes = machineEfficiencyPerMinute * tTwentyMinutes;
        byte tDay = 1;
        int machineEfficiencyPerDay = machineEfficiencyPerMinute * 60 * 24;
        byte tThreeDays = 3;
        int machineEfficiencyPerThreeDays = machineEfficiencyPerDay * tThreeDays;
        byte tMonth = 1;
        int machineEfficiencyPerMonth = machineEfficiencyPerDay * 30;



        System.out.println("За " + tTwentyMinutes + " минут машина произвела " + machineEfficiencyPerTwentyMinutes + " штук бутылок.");
        System.out.println("За " + tDay + " день машина произвела " + machineEfficiencyPerDay + " штук бутылок.");
        System.out.println("За " + tThreeDays + " дня машина произвела " + machineEfficiencyPerThreeDays + " штук бутылок.");
        System.out.println("За " + tMonth + " месяц машина произвела " + machineEfficiencyPerMonth + " штук бутылок.");


        //Задача 5
        byte whitePaint = 2;
        byte brownPaint = 4;
        byte totalPaint = 120;
        int totalClasses = totalPaint / (whitePaint + brownPaint);
        int totalWhitePaint = whitePaint * totalClasses;
        int totalBrownPaint = brownPaint * totalClasses;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски.");

        //Задача 6
        short bananas = 5 * 80;
        short milk = (200/100) * 105;
        short iceCream = 100 * 2;
        short eggs = 4 * 70;
        int totalWeightInGram = bananas + milk + iceCream + eggs;
        float totalWeightInKilo = (float) totalWeightInGram / 1000;

        System.out.println("Вес спортзавтрака составляет " + totalWeightInGram + " грамм или " + totalWeightInKilo + " килограмм.");

        //Задача 7
        short totalWeightLoss = 7 * 1000;
        short totalWeightLossPerDay1 = 250;
        short totalWeightLossPerDay2 = 500;
        int totalDays = totalWeightLoss / totalWeightLossPerDay1;
        int totalDays2 = totalWeightLoss / totalWeightLossPerDay2;
        int averageValueDays = totalDays + totalDays2 / 2;

        System.out.println("Чтобы потерять в весе 7 кг, спортсмену потребуется " + totalDays + " дней, если худеть по 250 грамм в день, или " + totalDays2 + " дней, если худеть по 500 грамм в день. В среднем потребуется " + averageValueDays + " дней.");

        //Задача 8
        int mashaSalary1 = 67760;
        int denisSalary1 = 83690;
        int kristinaSalary1 = 76230;
        double mashaSalary10Percent = mashaSalary1 * 0.1;
        double denisSalary10Percent = denisSalary1 * 0.1;
        double kristinaSalary10Percent = kristinaSalary1 * 0.1;
        double mashaSalary2 = mashaSalary1 + mashaSalary10Percent;
        double denisSalary2 = denisSalary1 + denisSalary10Percent;
        double kristinaSalary2 = kristinaSalary1 + kristinaSalary10Percent;
        int mashaSalaryYear1 = mashaSalary1 * 12;
        int denisSalaryYear1 = denisSalary1 * 12;
        int kristinaSalaryYear1 = kristinaSalary1 * 12;
        double mashaSalaryYear2 = mashaSalary2 * 12;
        double denisSalaryYear2 = denisSalary2 * 12;
        double kristinaSalaryYear2 = kristinaSalary2 * 12;
        double mashaSalaryYearDifference = mashaSalaryYear2 - mashaSalaryYear1;
        double denisSalaryYearDifference = denisSalaryYear2 - denisSalaryYear1;
        double kristinaSalaryYearDifference = kristinaSalaryYear2 - kristinaSalaryYear1;

        System.out.println("Маша теперь получает " + mashaSalaryYear2 + " рублей. Годовой доход вырос на " + mashaSalaryYearDifference + " рублей.");
        System.out.println("Денис теперь получает " + denisSalary2 + " рублей. Годовой доход вырос на " + denisSalaryYearDifference + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaSalaryYear2 + " рублей. Годовой доход вырос на " + kristinaSalaryYearDifference + " рублей.");













    }
}