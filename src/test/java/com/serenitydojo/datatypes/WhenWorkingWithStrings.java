package com.serenitydojo.datatypes;

import org.junit.Test;

import java.util.Locale;

public class WhenWorkingWithStrings {
    @Test
    public void convertLowerToUpper() {
        String a = "John- Mary";
        System.out.println(a.toLowerCase());
    }

    @Test
    public void convertUpperToLower() {
        String a = "John- Mary";
        System.out.println(a.toUpperCase());
    }

    @Test
    public void trimExtraSpaces() {
        String spaces = "Extra Spaces  ";
        System.out.println(spaces.trim());
    }

    @Test
    public void lengthOfString() {
        String length = "StringLength";
        System.out.println(length.length());
    }

    @Test
    public void replaceString() {
        String replace = "QA Engineer";
        System.out.println(replace.replace("Engineer", "Automation"));
    }
}
