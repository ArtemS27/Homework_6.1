package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CountVacationTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/incomingValues.csv")
    public void testFirstCase(int threshold, int money, int income, int expense) {
        CountVacation service = new CountVacation();
        int monthOfVacation = service.calculate(threshold, money, income, expense);
    }

}
