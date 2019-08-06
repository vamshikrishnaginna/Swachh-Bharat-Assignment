package com.rubiconred.swachhbharat;

import java.util.ArrayList;
import java.util.Scanner;

public class Wastage {

    private String wasteType;
    private String brand;
    private int points = 0;
    private int weights = 0;
    ArrayList<Integer> weightsList = new ArrayList<>();
    ArrayList<String> wasteTypeItems = new ArrayList<>();
    ArrayList<String> brandItems = new ArrayList<>();
    ArrayList<Integer> pointsList = new ArrayList<>();
    private int totalItems = 0;


    public Wastage() {
        takeInputs();
    }

    public void takeInputs() {

        WeightsAndPoints wap = new WeightsAndPoints();
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

            weights = wap.getWeight(wasteType + "_" + brand) + weights;
            points = wap.getPoints(wasteType + "_" + brand) + points;
            wasteTypeItems.add(wasteType);
            brandItems.add(brand);
            weightsList.add(weights);
            pointsList.add(points);
            totalItems = wasteTypeItems.size();
            System.out.println("Do you want to add more?y/n");

            char flag = sc1.next().charAt(0);
            if (flag == 'n' || flag == 'N') {
                break;
            } else {


            }


        }

    }

    public String getWasteType() {
        return wasteType;
    }

    public void setWasteType(String wasteType) {
        this.wasteType = wasteType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public ArrayList<Integer> getWeightsList() {
        return weightsList;
    }

    public void setWeightsList(ArrayList<Integer> weightsList) {
        this.weightsList = weightsList;
    }

    public ArrayList<Integer> getPointsList() {
        return pointsList;
    }

    public void setPointsList(ArrayList<Integer> pointsList) {
        this.pointsList = pointsList;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getWeights() {
        return weights;
    }

    public void setWeights(int weights) {
        this.weights = weights;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    public ArrayList<String> getWasteTypeItems() {
        return wasteTypeItems;
    }

    public void setWasteTypeItems(ArrayList<String> wasteTypeItems) {
        this.wasteTypeItems = wasteTypeItems;
    }

    public ArrayList<String> getBrandItems() {
        return brandItems;
    }

    public void setBrandItems(ArrayList<String> brandItems) {
        this.brandItems = brandItems;
    }

    @Override
    public String toString() {
        return "Wastage{" +
                "wasteTypeItems=" + wasteTypeItems +
                ", brandItems=" + brandItems +
                '}';
    }
}
