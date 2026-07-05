//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        byte level = 5;
        System.out.println("Значение переменной level с типом byte равно " + level);
        short year = 2024;
        System.out.println("Значение переменной year с типом short равно " + year);
        int age = 25;
        System.out.println("Значение переменной age с типом int равно " + age);
        long population = 7800000000L;
        System.out.println("Значение переменной population с типом long равно " + population);
        float temperature = 22.5f;
        System.out.println("Значение переменной temperature с типом float равно " + temperature);
        double distance = 384400.55;
        System.out.println("Значение переменной distance с типом double равно " + distance);
        double fractionalNumber = 27.12;
        System.out.println("Значение переменной fractionalNumber с типом double равно " + fractionalNumber);
        long bigNumber = 987678965549L;
        System.out.println("Значение переменной bigNumber с типом long равно " + bigNumber);
        float floatNumber = 2.786f;
        System.out.println("Значение переменной floatNumber с типом float равно " + floatNumber);
        short shortNumber = 569;
        System.out.println("Значение переменной shortNumber с типом short равно " + shortNumber);
        short negativeNumber = -159;
        System.out.println("Значение переменной negativeNumber с типом short равно " + negativeNumber);
        int mediumNumber = 27897;
        System.out.println("Значение переменной mediumNumber с типом int равно " + mediumNumber);
        byte smallNumber = 67;
        System.out.println("Значение переменной smallNumber с типом byte равно " + smallNumber);
        int studentsLyudmila = 23;
        int studentsAnna = 27;
        int studentsEkaterina = 30;
        int totalPaper = 480;
        int totalStudents = studentsLyudmila + studentsAnna + studentsEkaterina;
        int paperPerStudent = totalPaper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги");
        int bottlesInTwoMinutes = 16;
        int minutesInTwoMinutes = 2;
        int bottlesPerMinute = bottlesInTwoMinutes / minutesInTwoMinutes;
        int bottlesIn20Minutes = bottlesPerMinute * 20;
        System.out.println("За 20 минут машина произвела " + bottlesIn20Minutes + " штук бутылок");
        int minutesPerDay = 24 * 60;
        int bottlesInOneDay = bottlesPerMinute * minutesPerDay;
        System.out.println("За сутки машина произвела " + bottlesInOneDay + " штук бутылок");
        int bottlesInThreeDays = bottlesInOneDay * 3;
        System.out.println("За 3 дня машина произвела " + bottlesInThreeDays + " штук бутылок");
        int daysInMonth = 30;
        int bottlesInMonth = bottlesInOneDay * daysInMonth;
        System.out.println("За 1 месяц машина произвела " + bottlesInMonth + " штук бутылок");
        int totalPaintCans = 120;
        int whitePerClass = 2;
        int brownPerClass = 4;
        int cansPerClass = whitePerClass + brownPerClass;
        int classes = totalPaintCans / cansPerClass;
        int totalWhite = classes * whitePerClass;
        int totalBrown = classes * brownPerClass;
        System.out.println("В школе, где " + classes + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски");
        }
    }