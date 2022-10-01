package Standart_Tests;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Convert {

    public static void main(String[] args) throws ParseException {
        Date date = new Date();
//        getTimestamp(date.toString());
        getTimestamp2(date.toString());

    }

    public static Timestamp getTimestamp(String date) {
        Timestamp timestamp;
        try {
            if (!date.isEmpty()) timestamp = new Timestamp(Long.parseLong(date));
            else timestamp = new Timestamp(0);
        } catch (NumberFormatException exception) {
//            LOGGER.error(exception.getMessage(), exception);
            throw new NumberFormatException(">>>>>>>>>> I failed to parseLong() the value of date ***" + date + "*** <<<<<<<<<<");
        }

        return timestamp;
    }

    public static Timestamp getTimestamp2(String sDate1) throws ParseException {
        Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
        Timestamp ts = new Timestamp(date1.getTime());
        return ts;
    }
}
