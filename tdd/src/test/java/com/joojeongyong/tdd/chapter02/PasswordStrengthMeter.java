package com.joojeongyong.tdd.chapter02;

public class PasswordStrengthMeter {

    public PasswordStrength meter(String s) {
        if (s == null || s.isEmpty()) {
            return PasswordStrength.INVALID;
        }

        int criteriaCounter = getCriteriaCounter(s);

        if (criteriaCounter <= 1) {
            return PasswordStrength.WEAK;
        }
        if (criteriaCounter == 2) {
            return PasswordStrength.NORMAL;
        }
        return PasswordStrength.STRONG;
    }

    private int getCriteriaCounter(String s) {
        int criteriaCounter = 0;

        if (s.length() >= 8) {
            criteriaCounter++;
        }
        if (meetsContainingNumberCriteria(s)) {
            criteriaCounter++;
        }
        if (meetsContainingUpperCaseCriteria(s)) {
            criteriaCounter++;
        }
        return criteriaCounter;
    }

    private boolean meetsContainingNumberCriteria(String s) {
        char[] arrayFromString = s.toCharArray();

        for (char c : arrayFromString) {
            if (c >= '0' && c <= '9') {
                return true;
            }
        }
        return false;
    }

    private boolean meetsContainingUpperCaseCriteria(String s) {
        char[] arrayFromString = s.toCharArray();

        for (char c : arrayFromString) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }
}