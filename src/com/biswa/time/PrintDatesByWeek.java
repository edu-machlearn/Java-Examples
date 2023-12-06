package com.biswa.time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.IsoFields;
import java.time.temporal.TemporalAdjusters;
import java.util.LinkedList;
import java.util.List;

import static java.time.Month.*;

public class PrintDatesByWeek {
    public static void main(String[] args) {
        int year = 2023; // Replace with your desired year
        Month month = JULY; // Replace with your desired month

        LocalDate startDate = LocalDate.of(year, month, 1);
        LocalDate endDate = startDate.with(TemporalAdjusters.lastDayOfMonth());

        LocalDate currentDay = startDate;
        while (currentDay.isBefore(endDate.plusDays(1))) {
            LocalDate endOfWeek = currentDay.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));

            if (endOfWeek.isAfter(endDate)) {
                endOfWeek = endDate;
            }

            System.out.println("----------");
            List<String> dates=null;
            while (!currentDay.isAfter(endOfWeek)) {
                dates= new LinkedList<>();
                dates.add(currentDay.toString());
                System.out.println(currentDay.getDayOfMonth());
                currentDay = currentDay.plusDays(1);
            }
        }
    }
}

