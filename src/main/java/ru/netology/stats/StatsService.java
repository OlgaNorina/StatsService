package ru.netology.stats;

public class StatsService {
    public static void main(String[] args) {
        int[] proceeds = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int sum = getSum(proceeds);
        System.out.println("Сумма всех продаж: " + sum + " руб.;");

        int average = getAverage(proceeds);
        System.out.println("Средняя сумма продаж в месяц: " + average + " руб.;");

        int monthMax = getMonthMax(proceeds);
        System.out.println("Месяц с максимальными продажами: " + monthMax + ";");

        int monthMin = getMonthMin(proceeds);
        System.out.println("Месяц с минимальными продажами: " + monthMin + ";");

        int countOverAverage = getCountOverAverage(proceeds);
        System.out.println("Количество месяцев с продажами выше среднего: " + countOverAverage + ";");

        int countUnderAverage = getCountUnderAverage(proceeds);
        System.out.println("Количество месяцев с продажами ниже среднего: " + countUnderAverage + ";");
    }

    public static int getSum(int[] proceeds) {
        // считаем сумму всех продаж
        int sum = 0;
        for (int proceed : proceeds) {
            sum += proceed;
        }
        return sum;
    }

    public static int getAverage(int[] proceeds) {
        int proceedsAverage = getSum(proceeds) / proceeds.length;
        return proceedsAverage;
    }

    public static int getMonthMax(int[] proceeds) {
        // выводим месяц, в который была максимальная продажа
        int proceedsMax = proceeds[0];
        int month = 0;
        int monthMax = 1;
        for (int proceed : proceeds) {
            month++;
            if (proceedsMax < proceed) {
                // если указать (proceedsMax <= proceed), выведится второй месяц = 8
                proceedsMax = proceed;
                monthMax = month;
            }
        }
        return monthMax;
    }

    public static int getMonthMin(int[] proceeds) {
        // выводим месяц, в который была максимальная продажа
        int proceedsMin = proceeds[0];
        int month = 0;
        int monthMin = 1;
        for (int proceed : proceeds) {
            month++;
            if (proceedsMin > proceed) {
                proceedsMin = proceed;
                monthMin = month;
            }
        }
        return monthMin;
    }


    public static int getCountOverAverage(int[] proceeds) {

        // выводим месяц, в который была максимальная продажа
        int proceedsAverage = getSum(proceeds) / proceeds.length;
        int count = 0;
        int countOverAverage = 0;
        for (int proceed : proceeds) {
            if (proceedsAverage < proceed) {
                count++;
                countOverAverage = count;
            }
        }
        return countOverAverage;
    }

    public static int getCountUnderAverage(int[] proceeds) {
        // выводим месяц, в который была максимальная продажа
        int proceedsAverage = getSum(proceeds) / proceeds.length;
        int count = 0;
        int countUnderAverage = 0;
        for (int proceed : proceeds) {
            if (proceedsAverage > proceed) {
                count++;
                countUnderAverage = count;
            }
        }
        return countUnderAverage;
    }
}
