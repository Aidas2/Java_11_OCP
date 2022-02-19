package foundation_test;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StringBuilders {

    public static void main(String[] args) throws ParseException {

        String dateString = "2022-02-01";
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = formatter.parse(dateString);
        System.out.println(date);
    }


}
