package com.rubiconred.swachhbharat;

import java.util.ArrayList;

public class ReportDemo {
    private int count = 0;
    private String userName;
    private String phoneNumber;
    private String email;
    private ArrayList<String> type;
    private ArrayList<String> brand;
    private ArrayList<Integer> points;
    private ArrayList<Integer> weight;


    private int totalWeight = 0;
    private int totalPoints = 0;
    private String couponCode;

    private int typeMaxlength = 0;
    private int brandMaxlength = 0;



    public ReportDemo(User user, WastageDispose wastageDispose) {
        count = wastageDispose.wasteTypeItems.size();

        userName = user.getuName();
        phoneNumber = user.getuPhone();
        email = user.getuEmail();
        Coupon coupon = new Coupon();
        couponCode = coupon.createRandomCode(8);
        type = wastageDispose.getWasteTypeItems();
        brand = wastageDispose.getBrandItems();
        points = wastageDispose.getPointsList();
        weight = wastageDispose.getWeightsList();
        System.out.println("               REPORT              ");
        System.out.println("===============+++++++=============");
        System.out.println("User Name   :" + userName);
        System.out.println("Phone Number:" + phoneNumber);
        System.out.println("Email       :" + email);
        System.out.println("Coupon code :" + couponCode);
        count = wastageDispose.getTotalItems();
        System.out.println("Total Items :" + count);
        System.out.println("Item Details:");
        for (String type1 : type) {
            if (typeMaxlength < type1.length()) {
                typeMaxlength = type1.length();
            }
        }
        for (String brand1 : brand) {
            if (brandMaxlength < brand1.length()) {
                brandMaxlength = brand1.length();
            }
        }
        System.out.println("---------------------------------------");
        System.out.print("SNO" + "\t" + "TYPE");
        for (int j = 0; j <= typeMaxlength - 4; j++) {

            System.out.print(" ");

        }
        System.out.println("\tBRAND\tWEIGHTS\tPOINTS");
        System.out.println("---------------------------------------");

        for (int i = 0; i < count; i++) {
            System.out.print(i + 1);

            System.out.print("\t");

            System.out.print(type.get(i));

            for (int j = 0; j <= typeMaxlength - type.get(i).length(); j++) {

                System.out.print(" ");

            }

            System.out.print("\t");
            System.out.print(brand.get(i));
            System.out.print("\t");

            System.out.print(weight.get(i));


            totalWeight += weight.get(i);
            System.out.print("\t \t");
            System.out.println(points.get(i));
            totalPoints += points.get(i);


        }
        System.out.println("---------------------------------------");
        System.out.println("Total Weights:" + totalWeight + "gms\tTotal Points:" + totalPoints);
        ReportStore rs = new ReportStore(user, couponCode, count, wastageDispose);


    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<String> getType() {
        return type;
    }

    public void setType(ArrayList<String> type) {
        this.type = type;
    }

    public ArrayList<String> getBrand() {
        return brand;
    }

    public void setBrand(ArrayList<String> brand) {
        this.brand = brand;
    }

    public ArrayList<Integer> getPoints() {
        return points;
    }

    public void setPoints(ArrayList<Integer> points) {
        this.points = points;
    }

    public ArrayList<Integer> getWeight() {
        return weight;
    }

    public void setWeight(ArrayList<Integer> weight) {
        this.weight = weight;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(int totalWeight) {
        this.totalWeight = totalWeight;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public int getCount() {
        return count;
    }

}
