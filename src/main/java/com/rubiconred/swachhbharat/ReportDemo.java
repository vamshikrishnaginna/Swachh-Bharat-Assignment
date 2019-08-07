package com.rubiconred.swachhbharat;

public class ReportDemo {
    private int count = 0;
    private int typeMaxlength = 0;
    private int brandMaxlength = 0;
    private int totalWeight = 0;
    private int totalPoints = 0;


    public ReportDemo(User user, Wastage wastage) {
        count = wastage.wasteTypeItems.size();
        System.out.println("               REPORT              ");
        System.out.println("===============+++++++=============");
        System.out.println("User Name   :" + user.getuName());
        System.out.println("Phone Number:" + user.getuPhone());
        System.out.println("Email       :" + user.getuEmail());
        Coupon coupon = new Coupon();
        System.out.println("Coupon code :" + coupon.createRandomCode(8));
        count = wastage.getTotalItems();
        System.out.println("Total Items :" + count);
        System.out.println("Item Details:");
        for (String type1 : wastage.getWasteTypeItems()) {
            if (typeMaxlength < type1.length()) {
                typeMaxlength = type1.length();
            }
        }
        for (String brand1 : wastage.getBrandItems()) {
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

            System.out.print(wastage.getWasteTypeItems().get(i));

            for (int j = 0; j <= typeMaxlength - wastage.getWasteTypeItems().get(i).length(); j++) {

                System.out.print(" ");

            }

            System.out.print("\t");
            System.out.print(wastage.getBrandItems().get(i));
            System.out.print("\t");
            System.out.print(wastage.getWeightsList().get(i));
            totalWeight += wastage.getWeightsList().get(i);
            System.out.print("\t \t");
            System.out.println(wastage.getPointsList().get(i));
            totalPoints += wastage.getPointsList().get(i);


        }
        System.out.println("---------------------------------------");
        System.out.println("Total Weights:" + totalWeight + "gms\tTotal Points:" + totalPoints);


    }

}
