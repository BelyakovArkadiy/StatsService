package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void calculateSum() {
        StatsService statsService = new StatsService();
        int[]sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        int actual = statsService.calculateSum(sales);
        int expected = 180;
        assertEquals(expected,actual);


    }

    @Test
    void calculateMean() {
        StatsService statsService = new StatsService();
        int[]sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        int actual = statsService.calculateMean(sales);
        int expected = 15;
        assertEquals(expected,actual);
    }

    @Test
    void monthMaxSales() {
        StatsService statsService = new StatsService();
        int[]sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        int actual = statsService.monthMaxSales(sales);
        int expected = 8;
        assertEquals(expected,actual);
    }

    @Test
    void monthMinSales() {
        StatsService statsService = new StatsService();
        int[]sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        int actual = statsService.monthMinSales(sales);
        int expected = 9;
        assertEquals(expected,actual);
    }

    @Test
    void monthSalesBelowMeanSales() {
        StatsService statsService = new StatsService();
        int[]sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        int actual = statsService.monthSalesBelowMeanSales(sales);
        int expected = 5;
        assertEquals(expected,actual);
    }

    @Test
    void monthSalesAboveMeanSales() {
        StatsService statsService = new StatsService();
        int[]sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        int actual = statsService.monthSalesAboveMeanSales(sales);
        int expected = 5;
        assertEquals(expected,actual);
    }
}