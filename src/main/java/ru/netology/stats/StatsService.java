package ru.netology.stats;

public class StatsService {
    public long calclulatetotalSum(long[] sales) {
        long totalSum = 0;
        for (long sale : sales) {
            totalSum += sale;
        }
        return totalSum;
    }

    public static long calculatemidSum(long[] sales) {
        long totalSum = 0;
        long midTotalSum = 0;
        for (long sale : sales) {
            totalSum += sale;
            midTotalSum = totalSum / sales.length;
        }
        return midTotalSum;
    }

    public static long calculateMaxSale(long[] sales) {
        long maxSale = sales[0];
        int indexMax = 0;
        for (long sale : sales)
            if (maxSale < sale) {
                maxSale = sale;
                for (indexMax = 0; indexMax < sales.length; indexMax++)
                    if (sales[indexMax] == maxSale) ;
            }
        return indexMax;
    }
}