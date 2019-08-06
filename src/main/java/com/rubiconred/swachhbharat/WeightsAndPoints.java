package com.rubiconred.swachhbharat;

import java.util.Hashtable;

public class WeightsAndPoints {

    public WeightsAndPoints() {
        Hashtable<String, Integer> weights = new Hashtable<String, Integer>();
        Hashtable<String, Integer> points = new Hashtable<String, Integer>();
        /*Weights*/
        /*Plastic waste */

        weights.put("plastic_pepsi", 30);
        weights.put("plastic_coke", 30);
        weights.put("plastic_sprite", 30);
        weights.put("plastic_other", 30);

        /*Metal waste */

        weights.put("metal_pepsi", 30);
        weights.put("metal_coke", 30);
        weights.put("metal_sprite", 30);
        weights.put("metal_other", 30);

        /*Glass waste */

        weights.put("glass_pepsi", 30);
        weights.put("glass_coke", 30);
        weights.put("glass_sprite", 30);
        weights.put("glass_other", 30);
        /*other waste */

        weights.put("other_other", 30);

        /*Points*/
        /*Plastic waste */

        points.put("plastic_pepsi", 30);
        points.put("plastic_coke", 30);
        points.put("plastic_sprite", 30);
        points.put("plastic_other", 30);

        /*Metal waste */

        points.put("metal_pepsi", 30);
        points.put("metal_coke", 30);
        points.put("metal_sprite", 30);
        points.put("metal_other", 30);

        /*Glass waste */

        points.put("glass_pepsi", 30);
        points.put("glass_coke", 30);
        points.put("glass_sprite", 30);
        points.put("glass_other", 30);
        /*other waste */

        points.put("other_other", 30);


    }

}
