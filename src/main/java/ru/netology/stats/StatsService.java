package ru.netology.stats;


public class StatsService {
    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;

        }
        return totalSale;

    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int monthMaxSale(long[] sales) {
        int resultMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[resultMonth]) {
              resultMonth = i;
            }
        }
        return resultMonth +1;
    }
    public int monthMinSale(long[] sales) {
        int resultMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[resultMonth]) {
                resultMonth = i;
            }
        }
        return resultMonth +1;
    }
    public int lowAverageMonth(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }
    public int aboveAverageMonth(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }
}
