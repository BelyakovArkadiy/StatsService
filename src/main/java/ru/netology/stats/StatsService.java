package ru.netology.stats;

public class StatsService {

        public int calculateSum(int[] sales) {
                int sum = 0;
                for (int sale : sales) {
                        sum += sale;
                }
                return sum;
        }

        public int calculateMean(int[] sales) {
                int numberOfMonths = sales.length;
                int mean = calculateSum(sales) / numberOfMonths;
                return mean;
        }

        public int monthMaxSales(int[] sales) {
                int max = sales[sales.length-1];
                int maxIndex = sales.length-1;
                for (int i = maxIndex; i >=0; i--) {
                        if (sales[i] > max) {
                                max = sales[i];
                                maxIndex = i;


                        }

                }
                return maxIndex+1;
        }
        public int monthMinSales(int[] sales) {
                int min = sales[0];
                int minIndex = 0;
                for (int i = 0; i < sales.length; i++) {
                        if (sales[i] < min) {
                                min = sales[i];
                                minIndex = i;
                        }
                }
                return minIndex+1;
        }

        public int monthSalesBelowMeanSales(int[] sales){
                int mean = calculateMean(sales);
                int month = 0;
                for (int i = 0; i < sales.length; i++){
                        if (sales[i]< mean) {
                          month++;
                        }
                }
                return month;
        }
        public int monthSalesAboveMeanSales(int[] sales){
                int mean = calculateMean(sales);
                int month = 0;
                for (int i = 0; i < sales.length; i++){
                        if (sales[i]> mean) {
                                month++;
                        }
                }
                return month;
        }
}