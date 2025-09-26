package com.pluralsight;

public class Format {
    public static void main(String[] args){
        System.out.println(formatName("Bilal", "Al Alawneh"));
        String format = formatName("Bilal", "Al Alawneh");
        System.out.println(format);
    }
    public static String formatName(String first, String second){
        return second + ", " + first;
    }
}
