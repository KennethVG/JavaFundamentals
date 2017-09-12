package be.oak3.datums;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Created by vangike on 21/04/2017.
 */
public class Oefening {

    public static void main(String[] args) {
        Scanner invoer = new Scanner(System.in);
        int beginjaar = invoer.nextInt();
        int eindjaar=invoer.nextInt();

        final int dag = 13;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");

        for (LocalDate date = LocalDate.ofYearDay(beginjaar, dag);
             date.isBefore(LocalDate.ofYearDay(eindjaar, dag));
             date = date.plusDays(1)) {

            if (date.getDayOfWeek() == DayOfWeek.FRIDAY && date.getDayOfMonth() == dag)
                System.out.println(date.format(formatter));
        }
    }
}
