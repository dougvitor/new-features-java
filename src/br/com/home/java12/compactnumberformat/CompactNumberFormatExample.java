package br.com.home.java12.compactnumberformat;

import java.text.CompactNumberFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormatExample {

    public static void main(String[] args) {
        final NumberFormat shortNumber = CompactNumberFormat.getCompactNumberInstance(new Locale("pt", "BR"), NumberFormat.Style.SHORT);
        System.out.println(shortNumber.format(5000000));

        final NumberFormat longNumber = CompactNumberFormat.getCompactNumberInstance(new Locale("pt", "BR"), NumberFormat.Style.LONG);
        System.out.println(longNumber.format(5000000));
    }

}
