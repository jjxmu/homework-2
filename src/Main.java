//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задача 1
       byte b1 = 1;
       short s1 = 1111;
       int i1 = 111111;
       long l1 = 111111111L;
       float f1 = 1.1F;
       double d1 = 1.1111;

       System.out.println("Значение переменной b1 с типом byte равно " + b1);
       System.out.println("Значение переменной s1 с типом short равно " + s1);
       System.out.println("Значение переменной i1 с типом int равно " + i1);
       System.out.println("Значение переменной l1 с типом long равно " + l1);
       System.out.println("Значение переменной f1 с типом float равно " + f1);
       System.out.println("Значение переменной d1 с типом double равно " + d1);



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
        byte paperPerStudent = (byte) (paper/(annaPavlovnaStudent + annaSergeevnaStudent + ekaterinaAndreevnaStudent));

        System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги.");

        //Задача 4
        byte machineEfficiencyPerMinute = 16 / 2;
        byte tMinute = 1;
        byte tTwentyMinutes = (byte) (tMinute * 20);
        short machineEfficiencyPerTwentyMinutes = (short) (machineEfficiencyPerMinute * tTwentyMinutes);
        byte tDay = 1;
        short machineEfficiencyPerDay = (short) (machineEfficiencyPerMinute * 60 * 24);
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
        byte totalClasses = (byte)(totalPaint / (whitePaint + brownPaint));
        byte totalWhitePaint = (byte)(whitePaint * totalClasses);
        byte totalBrownPaint = (byte)(brownPaint * totalClasses);
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски.");

        //Задача 6
        short bananas = 5 * 80;
        short milk = (200/100) * 105;
        short iceCream = 100 * 2;
        short eggs = 4 * 70;
        short totalWeightInGram = (short)(bananas + milk + iceCream + eggs);
        float totalWeightInKilo = (float) totalWeightInGram / 1000;

        System.out.println("Вес спортзавтрака составляет " + totalWeightInGram + " грамм или " + totalWeightInKilo + " килограмм.");

        //Задача 7
        short totalWeightLoss = 7 * 1000;
        short totalWeightLossPerDay1 = 250;
        short totalWeightLossPerDay2 = 500;
        byte totalDays = (byte) (totalWeightLoss / totalWeightLossPerDay1);
        byte totalDays2 = (byte) (totalWeightLoss / totalWeightLossPerDay2);
        byte averageValueDays = (byte) (totalDays + totalDays2 / 2);

        System.out.println("Чтобы потерять в весе 7 кг, спортсмену потребуется " + totalDays + " дней, если худеть по 250 грамм в день, или " + totalDays2 + " дней, если худеть по 500 грамм в день. В среднем потребуется " + averageValueDays + " дней.");

        //Задача 8
        int mashaSalary1 = 67760;
        int denisSalary1 = 83690;
        int kristinaSalary1 = 76230;
        float mashaSalary10Percent = (float) (mashaSalary1 * 0.1);
        float denisSalary10Percent = (float) (denisSalary1 * 0.1);
        float kristinaSalary10Percent = (float) (kristinaSalary1 * 0.1);
        float mashaSalary2 = (float) mashaSalary1 + mashaSalary10Percent;
        float denisSalary2 = (float) denisSalary1 + denisSalary10Percent;
        float kristinaSalary2 = (float) kristinaSalary1 + kristinaSalary10Percent;
        int mashaSalaryYear1 = mashaSalary1 * 12;
        int denisSalaryYear1 = denisSalary1 * 12;
        int kristinaSalaryYear1 = kristinaSalary1 * 12;
        float mashaSalaryYear2 = mashaSalary2 * 12;
        float denisSalaryYear2 = denisSalary2 * 12;
        float kristinaSalaryYear2 = kristinaSalary2 * 12;
        float mashaSalaryYearDifference = mashaSalaryYear2 - mashaSalaryYear1;
        float denisSalaryYearDifference = denisSalaryYear2 - denisSalaryYear1;
        float kristinaSalaryYearDifference = kristinaSalaryYear2 - kristinaSalaryYear1;

        System.out.println("Маша теперь получает " + mashaSalary2 + " рублей. Годовой доход вырос на " + mashaSalaryYearDifference + " рублей.");
        System.out.println("Денис теперь получает " + denisSalary2 + " рублей. Годовой доход вырос на " + denisSalaryYearDifference + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaSalary2 + " рублей. Годовой доход вырос на " + kristinaSalaryYearDifference + " рублей.");













    }
}