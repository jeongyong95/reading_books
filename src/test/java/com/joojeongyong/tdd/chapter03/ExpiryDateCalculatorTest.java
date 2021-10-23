package com.joojeongyong.tdd.chapter03;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExpiryDateCalculatorTest {

    private void assertExpiryDate(PayDate payDate, LocalDate expectedExpiryDate) {
        ExpiryDateCalculator calculator = new ExpiryDateCalculator();
        LocalDate expiryDate = calculator.calculateExpiryDate(payDate);

        assertEquals(expectedExpiryDate, expiryDate);
    }

    @Test
    void 만원을_납부하면_한달_뒤가_만료일이_됨() {
        LocalDate billingDate = LocalDate.of(2020, 3, 1);
        assertExpiryDate(new PayDate.Builder().billingDate(billingDate).payAmount(10_000).build(), LocalDate.of(2020, 4, 1));

        billingDate = LocalDate.of(2020, 5, 5);
        assertExpiryDate(new PayDate.Builder().billingDate(billingDate).payAmount(10_000).build(), LocalDate.of(2020, 6, 5));
    }

    @Test
    void 납부하면_한달_뒤_일자가_다름() {
        LocalDate billingDate = LocalDate.of(2019, 1, 31);
        assertExpiryDate(new PayDate.Builder().billingDate(billingDate).payAmount(10_000).build(), LocalDate.of(2019, 2, 28));

        billingDate = LocalDate.of(2020, 1, 31);
        assertExpiryDate(new PayDate.Builder().billingDate(billingDate).payAmount(10_000).build(), LocalDate.of(2020, 2, 29));

        billingDate = LocalDate.of(2020, 5, 31);
        assertExpiryDate(new PayDate.Builder().billingDate(billingDate).payAmount(10_000).build(), LocalDate.of(2020, 6, 30));
    }

    @Test
    void 첫_납부일과_만료일_일자가_다를_때_납부하기() {
        PayDate payDate = new PayDate.Builder().firstBillingDate(LocalDate.of(2019,1,31)).billingDate(LocalDate.of(2019,2,28)).payAmount(10_000).build();
        assertExpiryDate(payDate, LocalDate.of(2019,3,31));

        payDate = new PayDate.Builder().firstBillingDate(LocalDate.of(2019,1,30)).payAmount(10000).billingDate(LocalDate.of(2019,2,28)).build();
        assertExpiryDate(payDate, LocalDate.of(2019,3,30));

        payDate = new PayDate.Builder().firstBillingDate(LocalDate.of(2019,5,31)).payAmount(10000).billingDate(LocalDate.of(2019,6,30)).build();
        assertExpiryDate(payDate, LocalDate.of(2019,7,31));

    }

    @Test
    void 이만원_이상_납부하면_비례해서_만료일_계산() {
        assertExpiryDate(new PayDate.Builder().billingDate(LocalDate.of(2019,3,1)).payAmount(30000).build() ,LocalDate.of(2019,6,1));

        PayDate payDate = new PayDate.Builder().firstBillingDate(LocalDate.of(2019,1,31)).payAmount(20000).billingDate(LocalDate.of(2019,3,31)).build();
        assertExpiryDate(payDate, LocalDate.of(2019,5,31));
    }

    @Test
    void 첫_납부일과_만료일_일자가_다를_때_2만원_이상_납부() {
        PayDate payDate = new PayDate.Builder().firstBillingDate(LocalDate.of(2019, 1, 31)).billingDate(LocalDate.of(2019, 2, 28)).payAmount(20000).build();
        assertExpiryDate(payDate, LocalDate.of(2019,4,30));
    }

    @Test
    void 십만원을_납부하면_1년_서비스_제공() {
        assertExpiryDate(new PayDate.Builder().billingDate(LocalDate.of(2020,1,1)).payAmount(100_000).build(), LocalDate.of(2021,1,1));
    }

    @Test
    void 십만원_이상_납부할_때_서비스_제공() {
        assertExpiryDate(new PayDate.Builder().billingDate(LocalDate.of(2020,1,1)).payAmount(230000).build(), LocalDate.of(2022,4,1));
    }
}
