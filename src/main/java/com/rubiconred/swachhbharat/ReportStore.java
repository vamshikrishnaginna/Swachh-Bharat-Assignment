package com.rubiconred.swachhbharat;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

class ReportStore {

    private String userName;

    ReportStore(User user, String couponCode, int count, WastageDispose wastageDispose) {
        String phoneNumber = user.getuPhone();
        String email = user.getuEmail();
        JSONObject obj = new JSONObject();
        obj.put("UserName", user.getuName());
        obj.put("PhoneNumber", user.getuPhone());
        obj.put("Email", user.getuEmail());
        obj.put("CouponCode", couponCode);
        obj.put("TotalItems", count);

        JSONArray typeList = new JSONArray();
        typeList.addAll(wastageDispose.getWasteTypeItems());
        obj.put("TypeList", typeList);

        JSONArray brandList = new JSONArray();
        brandList.addAll(wastageDispose.getBrandItems());
        obj.put("BrandType", brandList);

        JSONArray weightsList = new JSONArray();
        weightsList.addAll(wastageDispose.getWeightsList());
        obj.put("WeightsList", weightsList);

        JSONArray pointsList = new JSONArray();
        pointsList.addAll(wastageDispose.getPointsList());
        obj.put("PointsList", pointsList);

        try {

            FileWriter file = new FileWriter("src/main/java/com/rubiconred/swachhbharat/data/data.json");
            file.write(obj.toJSONString());
            file.flush();
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        //System.out.print(obj.toJSONString());

    }
}
