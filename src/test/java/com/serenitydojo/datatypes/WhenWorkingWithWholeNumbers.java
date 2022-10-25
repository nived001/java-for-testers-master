package com.serenitydojo.datatypes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class WhenWorkingWithWholeNumbers {
    @Test
    public void addingNumbersTogether() {
        int intialYear = 1985;
        int targetYear = 0;
        int timeJump = 30;
        targetYear = intialYear + timeJump;
        assertThat(targetYear, equalTo(2015));
    }

    @Test
    public void convertCelciusToFarenheit() {
        float celcius = 37.2f;
        float farenheit = 0;
        farenheit = (celcius * 9 / 5) + 32;
        assertThat(farenheit, equalTo(98.96001F));
    }

    @Test
    public void convertKilogramsToPounds() {
        int kiloGrams = 2000;
        double convertRate = 0.45;
        double pounds = 0;
        pounds = kiloGrams / convertRate;
        assertThat(pounds, equalTo(4444.444444444444));
    }


}
