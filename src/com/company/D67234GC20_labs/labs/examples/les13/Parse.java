package com.company.D67234GC20_labs.labs.examples.les13;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Parse {

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
    Date myDate;

    public void parseDate(String dateString) {

        try {
            String formated;

            myDate = simpleDateFormat.parse(dateString);
            formated = simpleDateFormat.format(myDate);

            System.out.println(myDate);
            System.out.println(formated);
        } catch (ParseException exception){
            System.out.println("Problemes");
            System.out.println("Intenta recuperar dades");
            System.out.println(exception);
        }

    }
}
