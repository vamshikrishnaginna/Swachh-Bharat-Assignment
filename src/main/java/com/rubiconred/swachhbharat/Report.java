package com.rubiconred.swachhbharat;

public class Report {

    int count = 0;

    public Report(User newUser, Wastage wastage) {

        System.out.println("==============================");
        System.out.println("User:" + newUser.getuName());
        count = wastage.getTotalItems();
        System.out.println("Total Items:" + count);
        System.out.println("Item Details:");
        System.out.println("--------------------------------------------");
        System.out.println("| Type       Brand       weight      points |");
        System.out.println("--------------------------------------------");

        for (int i = 0; i < count; i++) {
            System.out.println("|" + wastage.getWasteTypeItems().get(i) + "       " + wastage.getBrandItems().get(i) + "       " + wastage.getWeightsList().get(i) + "       " + wastage.getPointsList().get(i) + "|");

        }
        System.out.println("          Total    " + wastage.getWeights() + "     " + wastage.getPoints());
        Coupon newCoupon = new Coupon();
        System.out.println("Coupon Code:" + newCoupon.createRandomCode(8));


    }


}



