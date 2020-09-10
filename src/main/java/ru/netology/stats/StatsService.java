package ru.netology.stats;

public class StatsService {
   //Сумма продаж
    public long calclulatetotalSum(long[] sales) {
        long totalSum = 0;
        for (long sale : sales) {
            totalSum += sale;
        }
        return totalSum;
    }

   //Средняя сумма
    public static long calculatemidSum(long[] sales) {
        long totalSum = 0;
        long midTotalSum = 0;
        for (long sale : sales) {
            totalSum += sale;
            midTotalSum = totalSum / sales.length;
        }
        return midTotalSum;
    }
   // Месяц, в котором был пик продаж
    public long findMonthMaxSale(long[] sales) {
        long maxSale = sales[0];
        int month = 1;
        int monthMaxSales = month;
        for (long sale : sales) {
            if (maxSale <= sale) {
                maxSale = sale;
                monthMaxSales = month;
            }
            month += 1;
        }
        return monthMaxSales;
    }

    //Месяц, в котором был минимум продаж
    public long findMonthMinSale (long[] sales) {
        long minSale = sales [0];
        int month = 1;
        int monthMinSales = month;
        for (long sale : sales) {
            if(minSale <= sale) {
                minSale = sale;
                monthMinSales = month;
            }
            month += 1;
        }
        return monthMinSales;
    }

    //Кол-во месяцев, в которых продажи были ниже среднего
    public long numMonthLessMid (long[] sales) {
        StatsService service = new StatsService();
        long midTotalSum = service.calculatemidSum(sales);
        int numMonth = 0;
        for (long sale : sales) {
            if (sale < midTotalSum) {
                numMonth += 1;
            }
        }
        return numMonth;
    }

    //Кол-во месяцев, в которых продажи были выше среднего
    public long numMonthMoreMid (long[] sales) {
        StatsService service = new StatsService();
        long midTotalSum = service.calculatemidSum(sales);
        int numMonth = 0;
        for (long sale : sales) {
            if (sale > midTotalSum) {
                numMonth += 1;
            }
        }
        return numMonth;
    }
}



