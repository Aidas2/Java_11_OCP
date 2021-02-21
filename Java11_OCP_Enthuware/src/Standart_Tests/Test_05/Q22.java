package Standart_Tests.Test_05;

import java.text.DateFormat;
import java.util.Locale;

public class Q22 {
    public static void main(String[] args) {
        compute1();
        compute2();
        compute3();
        compute4();
    }

    static void compute1() {
//        Locale l = Locale.getDefault();
//        DateFormat df = DateFormat.getDateInstance(l);
//        System.out.println(l.getCountry() + " " + df.format(df));
    }

    static void compute2() {
//        Locale l = Locale.getDefault();
//        DateFormat df = DateFormat.getDateInstance();
//        System.out.println(l.getCountry() + " " + df.format(df, l));
    }

    static void compute3() {
        Locale l = Locale.getDefault();
        System.out.println(l + " " + l.getCountry() + " " + l.getDisplayCountry());
        DateFormat df = DateFormat.getDateInstance();
        System.out.println(df);
        System.out.println(l.getCountry() + " " + df.format(df));
    }

    static void compute4() {
//        Locale l = new Locale();
//        DateFormat df = DateFormat.getDateInstance();
//        System.out.println(l.getCountry() + " " + df.format(df));
    }

}
