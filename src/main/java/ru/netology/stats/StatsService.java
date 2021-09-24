package ru.netology.stats;

public class StatsService<sum> {
    public int calculateSum(int[] sales){
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
    }
        return sum;
    }
    public long calculateAverage(int[] sales){
        return calculateSum(sales) / sales.length;
    }

    public int calculateMaxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int calculateMinSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int calculateBelowAverage(int[] sales) {
        int monthNo =0;
        for (int sale : sales) {
            if (sale < calculateAverage(sales)){
                monthNo++;
            }
                    }
        return monthNo;
    }

    public int calculateAboveAverage(int[] sales) {
        int monthNo = 0;
        for (int sale : sales) {
            if (sale > (calculateAverage(sales))){
                monthNo++;
            }
        }
        return monthNo;
    }
}

