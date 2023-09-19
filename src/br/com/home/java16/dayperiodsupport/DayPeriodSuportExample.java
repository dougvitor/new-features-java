package br.com.home.java16.dayperiodsupport;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DayPeriodSuportExample {

    public static void main(String[] args) {
        LocalTime date = LocalTime.parse("03:25:08.690791");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h:mm B");
        System.out.print(date.format(formatter));

    }
}
