package com.rubiconred.swachhbharat;

import java.util.Hashtable;

public class WeightsAndPoints {
    Hashtable<String, Integer> weights = new Hashtable<String, Integer>();
    Hashtable<String, Integer> points = new Hashtable<String, Integer>();
    public WeightsAndPoints() {

        /*Weights*/
        /*Plastic waste */

        weights.put("plastic_pepsi", 30);
        weights.put("plastic_coke", 35);
        weights.put("plastic_sprite", 20);
        weights.put("plastic_other", 15);

        /*Metal waste */

        weights.put("metal_pepsi", 60);
        weights.put("metal_coke", 65);
        weights.put("metal_sprite", 50);
        weights.put("metal_other", 45);

        /*Glass waste */

        weights.put("glass_pepsi", 47);
        weights.put("glass_coke", 50);
        weights.put("glass_sprite", 40);
        weights.put("glass_other", 29);
        /*other waste */

        weights.put("other_other", 30);

        /*Points*/
        /*Plastic waste */

        points.put("plastic_pepsi", 20);
        points.put("plastic_coke", 22);
        points.put("plastic_sprite", 22);
        points.put("plastic_other", 12);

        /*Metal waste */

        points.put("metal_pepsi", 35);
        points.put("metal_coke", 37);
        points.put("metal_sprite", 30);
        points.put("metal_other", 27);

        /*Glass waste */

        points.put("glass_pepsi", 30);
        points.put("glass_coke", 30);
        points.put("glass_sprite", 25);
        points.put("glass_other", 19);
        /*other waste */

        points.put("other_other", 20);


    }

    public int getWeight(String type) {
        return weights.get(type);

    }

    public int getPoints(String type) {
        return points.get(type);

    }

    public Hashtable<String, Integer> getWeightsTable() {
        return weights;
    }

    public Hashtable<String, Integer> getPointsTable() {
        return points;
    }
}
