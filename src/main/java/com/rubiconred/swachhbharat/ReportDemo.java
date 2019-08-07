package com.rubiconred.swachhbharat;

public class ReportDemo {
    private int count = 0;
    private int typeMaxlength = 0;
    private int brandMaxlength = 0;

    public ReportDemo(User user, Wastage wastage) {
        count = wastage.wasteTypeItems.size();
        System.out.println("             REPORT           ");
        System.out.println("=================+++++++=============");
        System.out.println("User:" + user.getuName());
        count = wastage.getTotalItems();
        System.out.println("Total Items:" + count);
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

        for (int i = 0; i < count; i++) {
            System.out.print(i);

            System.out.print("\t");

            System.out.print(wastage.getWasteTypeItems().get(i));

            for (int j = 0; j <= typeMaxlength - wastage.getWasteTypeItems().get(i).length(); j++) {

                System.out.print(" ");

            }

            System.out.print("\t");
            System.out.println(wastage.getBrandItems().get(i));


        }


    }

}
