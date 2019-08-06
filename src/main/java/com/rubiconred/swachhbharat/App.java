package com.rubiconred.swachhbharat;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Coupon object = new Coupon();
        int i = 0;
        while (i < 6) {
            object.createRandomCode(7);
            i++;
        }  
    }
}
