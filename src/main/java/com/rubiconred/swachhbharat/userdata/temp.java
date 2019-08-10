package com.rubiconred.swachhbharat.userdata;

import org.json.simple.JSONObject;

public class temp {
    public static void main(String[] args) {

        JSONObject obj = new JSONObject();
        obj.put("type", "plastic");
        obj.put("brand", "pepsi");
        obj.put("weight", new Integer(27));
        System.out.print(obj);
    }

}
