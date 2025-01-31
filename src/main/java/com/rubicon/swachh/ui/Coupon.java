package com.rubicon.swachh.ui;

import com.rubicon.swachh.models.CouponData;

import java.security.SecureRandom;
import java.util.Random;

public class Coupon {
    private CouponData couponData = new CouponData();

    public Coupon() throws Exception {
        String code = generateCouponCode();
        couponData.setCouponCode(code);
    }

    private String generateCouponCode() {
        char[] chars = "abcdefghijklmnopqrstuvwxyz1234567890".toCharArray();
        StringBuilder code = new StringBuilder();
        Random random = new SecureRandom();
        for (int i = 0; i < 7; i++) {
            char c = chars[random.nextInt(chars.length)];
            code.append(c);
        }
        return code.toString();
    }

    public CouponData getCouponData() {
        return couponData;
    }

}
