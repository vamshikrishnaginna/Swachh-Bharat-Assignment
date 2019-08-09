package com.rubiconred.swachhbharat;

import java.util.ArrayList;

public class ReportDemo {
    private int count = 0;
    private String userName;
    private String phoneNumber;
    private String email;
    private ArrayList<String> type;
    private ArrayList<String> brand;
    private ArrayList<String> points;
    private ArrayList<String> weight;


    private int totalWeight = 0;
    private int totalPoints = 0;
    private String couponCode;

    private int typeMaxlength = 0;
    private int brandMaxlength = 0;



    public ReportDemo(User user, WastageDispose wastageDispose) {
        count = wastageDispose.wasteTypeItems.size();

        System.out.println("               REPORT              ");
        System.out.println("===============+++++++=============");
        System.out.println("User Name   :" + user.getuName());
        System.out.println("Phone Number:" + user.getuPhone());
        System.out.println("Email       :" + user.getuEmail());
        Coupon coupon = new Coupon();
        couponCode = coupon.createRandomCode(8);
        System.out.println("Coupon code :" + couponCode);
        count = wastageDispose.getTotalItems();
        System.out.println("Total Items :" + count);
        System.out.println("Item Details:");
        for (String type1 : wastageDispose.getWasteTypeItems()) {
            if (typeMaxlength < type1.length()) {
                typeMaxlength = type1.length();
            }
        }
        for (String brand1 : wastageDispose.getBrandItems()) {
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

            System.out.print(wastageDispose.getWasteTypeItems().get(i));

            for (int j = 0; j <= typeMaxlength - wastageDispose.getWasteTypeItems().get(i).length(); j++) {

                System.out.print(" ");

            }

            System.out.print("\t");
            System.out.print(wastageDispose.getBrandItems().get(i));
            System.out.print("\t");
            System.out.print(wastageDispose.getWeightsList().get(i));
            totalWeight += wastageDispose.getWeightsList().get(i);
            System.out.print("\t \t");
            System.out.println(wastageDispose.getPointsList().get(i));
            totalPoints += wastageDispose.getPointsList().get(i);


        }
        System.out.println("---------------------------------------");
        System.out.println("Total Weights:" + totalWeight + "gms\tTotal Points:" + totalPoints);
        ReportStore rs = new ReportStore(user, couponCode, getCount(), wastageDispose);


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

    public ArrayList<String> getPoints() {
        return points;
    }

    public void setPoints(ArrayList<String> points) {
        this.points = points;
    }

    public ArrayList<String> getWeight() {
        return weight;
    }

    public void setWeight(ArrayList<String> weight) {
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
