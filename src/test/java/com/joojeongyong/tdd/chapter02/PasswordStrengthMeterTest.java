package com.joojeongyong.tdd.chapter02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordStrengthMeterTest {

    private PasswordStrengthMeter meter = new PasswordStrengthMeter();

    private void assertStrength(PasswordStrength expected, String password) {
        PasswordStrength result = meter.meter(password);
        assertEquals(expected, result);
    }

    @Test
    void meetsAllCriteriaThenStrong() {
        assertStrength(PasswordStrength.STRONG, "ab12!!@AB");
        assertStrength(PasswordStrength.STRONG, "Vmfhgod!23");
    }

    @Test
    void meetsOtherCriteriaExceptForLengthThenNormal() {
        assertStrength(PasswordStrength.NORMAL, "vmfh123");
        assertStrength(PasswordStrength.NORMAL, "good!1");
    }

    @Test
    void meetsOtherCriteriaExceptForNumberThenNormal() {
        assertStrength(PasswordStrength.NORMAL, "ab!Abqwer");
    }

    @Test
    void nullInputThenInvalid() {
        assertStrength(PasswordStrength.INVALID, null);
    }

    @Test
    void meetsOtherCriteriaExceptForUpperCaseThenNormal() {
        assertStrength(PasswordStrength.NORMAL, "ab12!@df");
    }

    @Test
    void meetsOnlyLengthCriteriaThenWeak() {
        assertStrength(PasswordStrength.WEAK, "asdfqwer");
    }

    @Test
    void meetsOnlyNumberCriteriaThenWeak() {
        assertStrength(PasswordStrength.WEAK, "123aa");
    }

    @Test
    void meetsOnlyUpperCaseCriteriaThenWeak() {
        assertStrength(PasswordStrength.WEAK, "Aasd");
    }

    @Test
    void meetsNoCriteriaThenWeak() {
       assertStrength(PasswordStrength.WEAK, "abc");
    }
}
