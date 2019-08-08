package com.rubiconred.swachhbharat;

public class ReportDemo {
    private int count = 0;
    private int typeMaxlength = 0;
    private int brandMaxlength = 0;
    private int totalWeight = 0;
    private int totalPoints = 0;


    public ReportDemo(User user, WastageDispose wastageDispose) {
        count = wastageDispose.wasteTypeItems.size();
        System.out.println("               REPORT              ");
        System.out.println("===============+++++++=============");
        System.out.println("User Name   :" + user.getuName());
        System.out.println("Phone Number:" + user.getuPhone());
        System.out.println("Email       :" + user.getuEmail());
        Coupon coupon = new Coupon();
        System.out.println("Coupon code :" + coupon.createRandomCode(8));
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
        ReportStore rs = new ReportStore(user);


    }

}
