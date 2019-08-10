package com.rubiconred.swachhbharat;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import static com.rubiconred.swachhbharat.ReportFetch.readJsonSimpleDemo;

public class WeightsAndPoints {
    private String type;
    private String brand;
    private int weight;
    private int points;

    public WeightsAndPoints(String type, String brand) throws Exception {
        this.type = type;
        this.brand = brand;
        weight = findWeight(type, brand);
        points = calculatePoints(weight);

    }

    private int findWeight(String type, String brand) throws Exception {
        String typeInFile;
        String brandInFile;

        JSONObject object = (JSONObject) readJsonSimpleDemo("src/main/java/com/rubiconred/swachhbharat/data/weights.json");
        JSONObject weightsObject = (JSONObject) object.get("weights");
        JSONArray jsonArray = (JSONArray) weightsObject.get("waste");


        for (int i = 0; i < jsonArray.size(); i++) {

            JSONObject newObject = (JSONObject) jsonArray.get(i);
            brandInFile = newObject.get("brand").toString();
            typeInFile = newObject.get("type").toString();

            if (typeInFile.equals(type) && brandInFile.equals(brand)) {
                return Integer.parseInt(newObject.get("weight").toString());

            }

        }
        return 0;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPoints() {
        return points;
    }

    public int calculatePoints(int weight) {
        return ((weight / 2) + 5);
    }

    @Override
    public String toString() {
        return "WeightsAndPoints{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", weight=" + weight +
                '}';
    }
}
