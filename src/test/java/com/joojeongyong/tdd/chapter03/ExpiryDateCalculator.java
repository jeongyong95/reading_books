package com.joojeongyong.tdd.chapter03;

import java.time.LocalDate;
import java.time.YearMonth;

public class ExpiryDateCalculator {

    public LocalDate calculateExpiryDate(PayDate payDate) {
        int addedMonths = payDate.getPayAmount() / 10000;
        if (payDate.getPayAmount()>100000) {
            if (payDate.getPayAmount()%100000==0) {
                addedMonths = payDate.getPayAmount()/100000*12;
            } else {
                addedMonths = payDate.getPayAmount()/100000*12+payDate.getPayAmount()%100000/10000;
            }
        }


        if (payDate.getFirstBillingDate() != null) {
            return returnExpiryDateUsingFirstBillingDate(payDate, addedMonths);
        } else {
            return payDate.getBillingDate().plusMonths(addedMonths);
        }
    }

    private LocalDate returnExpiryDateUsingFirstBillingDate(PayDate payDate, int addedMonths) {
        LocalDate candidateExpDate = payDate.getBillingDate().plusMonths(addedMonths);
        final int dayOfFirstBilling = payDate.getFirstBillingDate().getDayOfMonth();
        if (dayOfFirstBilling != candidateExpDate.getDayOfMonth()) {
            final int lengthOfCandidateDate = YearMonth.from(candidateExpDate).lengthOfMonth();
            if (dayOfFirstBilling > lengthOfCandidateDate) {
                return candidateExpDate.withDayOfMonth(lengthOfCandidateDate);
            }
            return candidateExpDate.withDayOfMonth(payDate.getFirstBillingDate().getDayOfMonth());
        }
        return candidateExpDate;

    }
}
