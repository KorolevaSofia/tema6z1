package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncomeExpenseServiceTest {
    @Test
    public void testCalculate1() {
        IncomeExpenseService service = new IncomeExpenseService();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;

        int actual = service.calculate(income, expenses, threshold);
        int expexted = 3;

        Assertions.assertEquals(expexted, actual);
    }

    @Test
    public void testCalculate2() {
        IncomeExpenseService service = new IncomeExpenseService();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;

        int actual = service.calculate(income, expenses, threshold);
        int expexted = 2;

        Assertions.assertEquals(expexted, actual);
    }
}