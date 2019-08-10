package com.rubiconred.swachhbharat;

import java.security.SecureRandom;
import java.util.Random;

public class Coupon {
    User user;
    private String couponCode;

    public Coupon(User user) {
        this.user = user;
        couponCode = createRandomCode();
    }


    public String createRandomCode() {
        char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".toCharArray();
        StringBuilder sb = new StringBuilder();
        Random random = new SecureRandom();
        for (int i = 0; i < 8; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        String output = sb.toString();

        return output;
    }

    public User getUser() {

        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }
}
