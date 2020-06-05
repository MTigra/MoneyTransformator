package com.example.unitconversion;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class UnitConverter {

    static BigDecimal SEAMILES = BigDecimal.valueOf(0.000549957);
    static BigDecimal INCHES = BigDecimal.valueOf(39.3701);
    static BigDecimal FEET = BigDecimal.valueOf(3.28084);
    static BigDecimal YARD = BigDecimal.valueOf(1.09361);
    static BigDecimal MILES = BigDecimal.valueOf(0.000621371);
    static BigDecimal NANOMETERS = BigDecimal.valueOf(1_000_000_000);
    static BigDecimal MICROMETERS = BigDecimal.valueOf(1_000_000);
    static BigDecimal MILLIMETERS = BigDecimal.valueOf(1_000);
    static BigDecimal CENTIMETERS = BigDecimal.valueOf(100);
    static BigDecimal DENTIMETERS = BigDecimal.valueOf(10);
    static BigDecimal METERS = BigDecimal.valueOf(1);
    static BigDecimal KILOMETERS = BigDecimal.valueOf(0.001) ;

    static BigDecimal convert(String from, String to, BigDecimal value) {
        return toMeters(from, value).multiply(getCoefByTag(to)).setScale(11, RoundingMode.CEILING);
    }

    private static BigDecimal toMeters(String from, BigDecimal value) {
        return value.setScale(100, RoundingMode.CEILING).divide(getCoefByTag(from), RoundingMode.CEILING);
    }

    private static BigDecimal getCoefByTag(String tag) {
        switch (tag) {
            case "km": return KILOMETERS;
            case "m": return METERS;
            case "dm": return DENTIMETERS;
            case "cm": return CENTIMETERS;
            case "mm": return MILLIMETERS;
            case "mkm": return MICROMETERS;
            case "nm": return NANOMETERS;
            case "mi": return MILES;
            case "yard": return YARD;
            case "ft": return FEET;
            case "inch": return INCHES;
            case "nmi": return SEAMILES;
            default: throw new RuntimeException("no such unit {" + tag + "}");
        }
    }
}

