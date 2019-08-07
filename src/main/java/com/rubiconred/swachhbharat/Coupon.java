package com.rubiconred.swachhbharat;

import java.security.SecureRandom;
import java.util.Random;

public class Coupon {

    public String createRandomCode(int codeLength) {
        char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".toCharArray();
        StringBuilder sb = new StringBuilder();
        Random random = new SecureRandom();
        for (int i = 0; i < codeLength; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        String output = sb.toString();

        return output;
    }
}
