package com.macocoding.accesainternshiptest.utils;

import java.time.LocalDate;

public class DateUtils {
    public static LocalDate getLocalDateFromTitle(String title) {
        String[] fileNameParts = title.split("_");
        String dateString = fileNameParts[fileNameParts.length - 1];
        String[] dateParts = dateString.split("-");
        int year = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);
        int day = Integer.parseInt(dateParts[2]);
        return LocalDate.parse(year + "-" + month + "-" + day);
    }
}
