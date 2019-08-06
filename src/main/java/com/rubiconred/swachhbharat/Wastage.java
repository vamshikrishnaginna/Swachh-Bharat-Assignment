package com.rubiconred.swachhbharat;

import java.util.ArrayList;
import java.util.Scanner;

public class Wastage {

    private String wasteType;
    private String brand;
    ArrayList<String> wasteTypeItems = new ArrayList<>();
    ArrayList<String> brandItems = new ArrayList<>();

    public Wastage() {
        takeInputs();
    }


    public void takeInputs() {
        while (true) {
            System.out.println("Select the category of waste");
            System.out.println("1.Plastic");
            System.out.println("2.Glass");
            System.out.println("3.Metal");
            System.out.println("4.Other");
            Scanner sc1 = new Scanner(System.in);
            switch (sc1.nextInt()) {
                case 1:
                    wasteType = "plastic";
                    break;

                case 2:
                    wasteType = "glass";
                    break;

                case 3:
                    wasteType = "metal";
                    break;

                case 4:
                    wasteType = "other";
                    break;
                default:
                    System.out.println("Please select the valid waste category");
                    break;


            }

            System.out.println("Select the brand");
            System.out.println("1.Pepsi");
            System.out.println("2.Coke");
            System.out.println("3.Sprite");
            System.out.println("4.Other");
            Scanner sc2 = new Scanner(System.in);
            switch (sc2.nextInt()) {
                case 1:
                    brand = "pepsi";
                    break;

                case 2:
                    brand = "coke";
                    break;

                case 3:
                    brand = "sprite";
                    break;

                case 4:
                    brand = "other";
                    break;
                default:
                    System.out.println("Please select the valid brand");
                    break;


            }

            System.out.println("Do you want to add more?y/n");
            char flag = sc1.next().charAt(0);
            if (flag == 'n' || flag == 'N') {
                break;
            } else {
                wasteTypeItems.add(wasteType);
                brandItems.add(brand);

            }


        }

    }

    @Override
    public String toString() {
        return "Wastage{" +
                "wasteTypeItems=" + wasteTypeItems +
                ", brandItems=" + brandItems +
                '}';
    }
}
