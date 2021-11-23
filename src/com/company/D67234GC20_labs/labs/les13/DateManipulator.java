package com.company.D67234GC20_labs.labs.les13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateManipulator {

    Date date;
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");

    public void parseDate(String dateString){
        try{
            dateString = "03/31/2001";
            date = simpleDateFormat.parse(dateString);
            System.out.println(date);
        }catch (ParseException e){
            System.out.println(e);
        }
    }
}
