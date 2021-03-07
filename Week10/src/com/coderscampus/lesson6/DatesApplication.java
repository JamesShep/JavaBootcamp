package com.coderscampus.lesson6;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DatesApplication {
    public static void main(String[] args) {
        //lesson6();

        // This is deprecated, don't use this approach, use Calendar instead
        Date jan012020 = new Date(120, 0, 1, 0, 0, 0);
        Calendar cal = Calendar.getInstance();
        System.out.println(jan012020);

        // java util dates, are 0 based for months
        Date someOtherDate = cal.getTime();
        cal.set(2020, 0, 1, 15, 1, 5);
        someOtherDate = cal.getTime();
        System.out.println(someOtherDate);

        // specify what you're adding, and to where
        cal.add(Calendar.HOUR, 2);
        System.out.println(cal.getTime());

        cal.add(Calendar.MINUTE, -1);
        System.out.println(cal.getTime());

        Date now = new Date();
        if (now.after(cal.getTime())) {
            System.out.println(now + " is after " + cal.getTime());
        }

    }

    private static void lesson6() {
        Date now = new Date();

        System.out.println(now);

        java.sql.Date jan011970 = new java.sql.Date(0);
        System.out.println(jan011970);
    }
}
