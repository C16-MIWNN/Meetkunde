package controller;

import java.time.*;

/**
 * @author Vincent Velthuizen
 * Leg LocalDate uit
 */
public class DateLauncher {

    public static void main(String[] args) {
        LocalDate vandaag = LocalDate.now();
        LocalTime nu = LocalTime.now();
        LocalDateTime echtNu = LocalDateTime.now();

        System.out.println(vandaag);
        System.out.println(nu);
        System.out.println(echtNu);

        LocalDate beginVan2025 = LocalDate.parse("2025-01-01");
        LocalDate beginVan2024 = LocalDate.of(2025, 1, 1);

        System.out.println(beginVan2025.getMonth());
        System.out.println(beginVan2025.getMonthValue());

        LocalDate mijnVerjaardag = LocalDate.of(1988, 2, 27);

        if (mijnVerjaardag.isAfter(LocalDate.now())) {
            System.out.println("Jij bent nog niet jarig (geweest dit jaar).");
        } else {
            int maanden = Period.between(vandaag, mijnVerjaardag).getMonths();
            System.out.printf("Je bent over %d maanden weer jarig\n", maanden);
        }

        LocalDate trouwdag = LocalDate.of(2022, 12, 21);
        LocalDate jubileum = trouwdag.plusYears(0).plusMonths(150);

        System.out.println(jubileum);
    }
}
