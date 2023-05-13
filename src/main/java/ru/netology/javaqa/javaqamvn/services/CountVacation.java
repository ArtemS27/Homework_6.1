package ru.netology.javaqa.javaqamvn.services;

public class CountVacation {
    public int calculate(int threshold, int money, int income, int expense) {
        for (int month = 1; month < 13; month++) {
            if (money < threshold) {
                System.out.println("Месяц " + month + " Денег " + money + " Придётся работать. " + " Заработал +" + income + ", потратил -" + expense);
                money = money + income;
                money = money - expense;
            } else {
                System.out.println("Месяц " + month + " Денег " + money + " Буду отдыхать. " + " Потратил -" + expense + ", затем ещё -" + (money - expense - ((money - expense) / 3)));
                money = (money - expense) / 3;
            }

        }
        System.out.println("");
        return money;
    }
}
