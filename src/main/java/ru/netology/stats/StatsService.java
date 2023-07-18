package ru.netology.stats;

public class StatsService {
    public long sumOfAllSales(long[] sales) {
        long totalSale = 0;

        for (long sale : sales) {
            totalSale = sale + totalSale;

        }

        return (int) totalSale;
    }

    public long averageSum(long[] sales) {
        long totalSale = 0;

        for (long sale : sales) {
            totalSale = sale + totalSale;


        }
        long averageSumSale = totalSale / 12;
        return averageSumSale;

    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int monthsBelowAverage(long[] sales) {
        int count = 0;

        for (long sale : sales) {
            if (sale < averageSum(sales)) {
                count++;
            }
        }
        return count;
    }

    public int monthsAboveAverage(long[] sales) {
        int count = 0;

        for (long sale : sales) {
            if (sale > averageSum(sales)) {
                count++;
            }
        }
        return count;
    }

}