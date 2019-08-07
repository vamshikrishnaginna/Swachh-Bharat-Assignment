package com.rubiconred.swachhbharat;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

//        User newUser = new User();
//        Wastage uWastage = new Wastage();
//        Report report = new Report(newUser, uWastage);

//        XStream xs = new XStream();
//        WeightsAndPoints wap=new WeightsAndPoints();
//        String points=xs.toXML(wap.getPointsTable()) ;
//        System.out.println(points);
        int[] productId = new int[]
                {1001, 1002, 1003, 1004, 1005, 1006, 1007, 1008, 1009, 1010,};
        String[] productName = new String[]{"Pepsi", "kissan jam", "Herbaloil", "Garnier man's", "Lays chips", "biscuits", "Bournvita", "Cadbury", "Parker Vector", "Nescafe",};
        String[] productType = new String[]{"Cold Drink", "Jam", "Oil", "Face wash", "chips", "Biscuits", "Health Supplement", "Chocolate", "Stationary", "Coffee",};
        float[] productPrice = new float[]{24, 65, 30, 79, 10, 20, 140, 20, 150, 80,};


        int productNameMaxlength = 0;
        int productTypeMaxlength = 0;


        for (String productName1 : productName) {
            if (productNameMaxlength < productName1.length()) {
                productNameMaxlength = productName1.length();
            }
        }


        for (String productType1 : productType) {
            if (productTypeMaxlength < productType1.length()) {
                productTypeMaxlength = productType1.length();
            }
        }


        for (int i = 0; i < productType.length; i++) {
            System.out.print(i);

            System.out.print("\t");

            System.out.print(productId[i]);

            System.out.print("\t");

            System.out.print(productName[i]);

            for (int j = 0; j <= productNameMaxlength - productName[i].length
                    (); j++) {

                System.out.print(" ");

            }

            System.out.print("\t");

            System.out.print(productType[i]);

            for (int j = 0; j <= productTypeMaxlength - productType[i].length
                    (); j++) {
                System.out.print(" ");
            }

            System.out.print("\t");

            System.out.println(productPrice[i]);
        }





    }
}
