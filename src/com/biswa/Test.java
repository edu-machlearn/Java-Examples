package com.biswa;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int year = 2023;
        int month = 8; // August
        int weekNumber = 0; // Second week

        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);

        LocalDate firstDayOfWeek = firstDayOfMonth.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        LocalDate desiredDate = firstDayOfWeek.plusWeeks(weekNumber - 1);

        for (int i = 0; i < 7; i++) {
            System.out.println(desiredDate.plusDays(i));
        }
    }
}
