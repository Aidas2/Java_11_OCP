package foundation_test;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StringBuilders {

    public static void main(String[] args) throws ParseException {

//        Given that Daylight Savings Time ends on Nov 1 at 2 AM in US/Eastern time zone, what will the following code print -

//        LocalDateTime ld = LocalDateTime.of(2015, Month.OCTOBER, 31, 10, 0);
//
//        ZonedDateTime date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
//        date = date.plus(Duration.ofDays(1));
//        System.out.println(date);
//
//        date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
//        date = date.plus(Period.ofDays(1));
//        System.out.println(date);



//        double d = getSwitch("-0.50");
//        System.out.println(d);

//        int[] array = {};
//        System.out.println(array.length);
//        System.out.println(array[-1]);

        char[] charArray = {'e', 's', 'p', 'r', 'e', 's', 's', 'o', '8', '9', '0'};
        System.arraycopy(charArray,2, charArray, 6, 5);
        System.out.println(charArray);
        System.out.println(charArray[8]);

    }

    public static double getSwitch(String str){
        return Double.parseDouble(str.substring(1, str.length()-1) );
    }


    }
