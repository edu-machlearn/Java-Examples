package com.biswa.time;

import java.time.LocalDateTime;

public class DateTimeTest {
    public static void main(String[] args) {
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt.getYear());
    }
}
