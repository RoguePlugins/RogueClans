package com.github.viiictorxd.rogueclans;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class RogueTest {

    public static void main(String[] args) {
        long now = System.currentTimeMillis();
        for (double value = 0; value < 1000000D; value++) {
            getFormat(value);
        }
        System.out.println(System.currentTimeMillis() - now + "ms");

        now = System.currentTimeMillis();

        for (double value = 0; value < 1000000D; value++) {
            format2(value);
        }
        System.out.println(System.currentTimeMillis() - now + "ms");
    }

    public static String format22(double value) {
        return DECIMAL_FORMAT.format(value);
    }

    public static String getFormat(double value) {
        String[] simbols = new String[] { "", "K", "M", "B", "T", "Q", "QI", "S", "SEP", "OC", "N", "DEC", "UN", "DUO",
                "TRE" };
        int index=0;

        while(value/1000.0>=1.0) {
            value/=1000.0;
            index++;
        }
        return format(value) + simbols[index];
    }

    public static final double LOG = 6.907755278982137D;
    public static final Object[][] VALUES2 = {
            {"", "K", "M", "B", "T", "Q", "QQ", "S", "SS", "O", "N", "D", "UN", "DD", "TR", "QT", "QN", "SD", "SPD", "OD", "ND", "VG", "UVG", "DVG", "TVG", "QTV"},
            {1D, 1000.0D, 1000000.0D, 1.0E9D, 1.0E12D, 1.0E15D, 1.0E18D, 1.0E21D, 1.0E24D, 1.0E27D, 1.0E30D, 1.0E33D, 1.0E36D, 1.0E39D, 1.0E42D, 1.0E45D, 1.0E48D, 1.0E51D, 1.0E54D, 1.0E57D, 1.0E60D, 1.0E63D, 1.0E66D, 1.0E69D, 1.0E72D}
    };
    public static final DecimalFormat FORMAT = new DecimalFormat("#,###.##", new DecimalFormatSymbols(new Locale("pt", "BR")));

    public static String format2(double number) {
        if (number == 0) return FORMAT.format(number);
        int index = (int) (Math.log(number) / LOG);
        return FORMAT.format(number / (double) VALUES2[1][index]) + VALUES2[0][index];
    }

    private static final DecimalFormat DECIMAL_FORMAT
            = new DecimalFormat("#,####", new DecimalFormatSymbols(new Locale("pt", "BR")));

    private static final String[] VALUES = {
            "", "", "K", "M", "B",
            "T", "Q", "QT", "S", "ST",
            "QR"
    };

    public static String format(Object object) {
        String val = DECIMAL_FORMAT
                .format(object)
                .replace(".", ",");

        int a = val.indexOf(",");
        int b = val.split(",").length;

        if (a == -1)
            return val;

        return (val.substring(0, a + 2) + VALUES[b])
                .replace(",0", "");
    }
}
