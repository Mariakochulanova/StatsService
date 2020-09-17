package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test
    void calculatetotalSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.calclulatetotalSum(sales);

        assertEquals(expected, actual);
        System.out.println(actual);
    }
    @Test
    void midSum(){
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.calculatemidSum(sales);

        assertEquals(expected , actual);
        System.out.println(actual);
    }
    @Test
    void monthMaxSale(){
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.findMonthMaxSale(sales);
        assertEquals(expected, actual);
        System.out.println(actual);

    }
    @Test
    void findMonthMinSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.findMonthMinSale(sales);
        assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    void numMonthLessMid () {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.numMonthLessMid(sales);
        assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    void numMonthMoreMid () {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.numMonthMoreMid (sales);
        assertEquals(expected, actual);
        System.out.println(actual);
    }
}