package com.joojeongyong.tdd.chapter02;

public class PasswordStrengthMeter {

    public PasswordStrength meter(String s) {

        if (s.length()<8) {
            return PasswordStrength.NORMAL;
        }

        boolean containedNumber = meetsContainingNumberCriteria(s);
        if (!containedNumber) {
            return PasswordStrength.NORMAL;
        }

        return PasswordStrength.STRONG;
    }

    private boolean meetsContainingNumberCriteria(String s) {
        char[] arrayFromString = s.toCharArray();

        for (char c : arrayFromString) {
            if (c>='0' && c<='9') {
                return true;
            }
        }
        return false;
    }
}
