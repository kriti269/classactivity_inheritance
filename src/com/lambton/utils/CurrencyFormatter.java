package com.lambton.utils;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatter {
    public static String format(double amount){
        Locale canada = new Locale("en","CA");
        NumberFormat cad = NumberFormat.getCurrencyInstance(canada);
        return cad.format(amount);
    }
}
