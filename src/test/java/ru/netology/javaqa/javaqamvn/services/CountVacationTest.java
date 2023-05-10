package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Test;

public class CountVacationTest {

    @Test
    public void testFirstCase() {
        int threshold = 20_000;
        int money = 0;
        int income = 10_000;
        int expense = 3_000;

        CountVacation service = new CountVacation();
        int monthOfVacation = service.calculate(threshold, money, income, expense);
    }

    @Test
    public void testSecondCase() {
        int threshold = 150_000;
        int money = 0;
        int income = 100_000;
        int expense = 60_000;
        CountVacation service = new CountVacation();
        int monthOfVacation = service.calculate(threshold, money, income, expense);
    }
}
