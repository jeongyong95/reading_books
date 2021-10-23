package com.joojeongyong.tdd.chapter03;

import org.springframework.boot.autoconfigure.info.ProjectInfoProperties;

import java.time.LocalDate;

public class PayDate {
    private LocalDate firstBillingDate;
    private LocalDate billingDate;
    private int payAmount;

    private PayDate() {

    }

    public PayDate(LocalDate firstBillingDate, LocalDate billingDate, int payAmount) {
        this.firstBillingDate = firstBillingDate;
        this.billingDate = billingDate;
        this.payAmount = payAmount;
    }

    public LocalDate getFirstBillingDate() {
        return firstBillingDate;
    }

    public void setFirstBillingDate(LocalDate firstBillingDate) {
        this.firstBillingDate = firstBillingDate;
    }

    public LocalDate getBillingDate() {
        return billingDate;
    }

    public void setBillingDate(LocalDate billingDate) {
        this.billingDate = billingDate;
    }

    public int getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(int payAmount) {
        this.payAmount = payAmount;
    }

    public static class Builder {
        private PayDate payDate = new PayDate();

        public Builder firstBillingDate(LocalDate firstBillingDate) {
            this.payDate.setFirstBillingDate(firstBillingDate);
            return this;
        }
        public Builder billingDate(LocalDate billingDate) {
            this.payDate.setBillingDate(billingDate);
            return this;
        }

        public Builder payAmount(int payAmount) {
            this.payDate.setPayAmount(payAmount);
            return this;
        }

        public PayDate build() {
            return this.payDate;
        }

    }
}
