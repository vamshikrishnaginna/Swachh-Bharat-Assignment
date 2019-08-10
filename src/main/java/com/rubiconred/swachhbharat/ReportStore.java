package com.rubiconred.swachhbharat;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;


class ReportStore {

    private String userName;

    ReportStore(User user, String couponCode, int count, WastageDispose wastageDispose,
                String timeStamp, int transactionId) {
        String phoneNumber = user.getuPhone();
        String email = user.getuEmail();
        JSONObject obj = new JSONObject();
        JSONObject objParent = new JSONObject();
        obj.put("timeStamp", timeStamp);
        obj.put("transactionId", transactionId);
        obj.put("userName", user.getuName());
        obj.put("phoneNumber", user.getuPhone());
        obj.put("email", user.getuEmail());
        obj.put("couponCode", couponCode);
        obj.put("count", count);

        JSONArray typeList = new JSONArray();
        typeList.addAll(wastageDispose.getWasteTypeItems());
        obj.put("typeList", typeList);

        JSONArray brandList = new JSONArray();
        brandList.addAll(wastageDispose.getBrandItems());
        obj.put("brandList", brandList);
        JSONArray weightsList = new JSONArray();
        weightsList.addAll(wastageDispose.getWeightsList());
        obj.put("weights", weightsList);

        JSONArray pointsList = new JSONArray();
        pointsList.addAll(wastageDispose.getPointsList());
        obj.put("points", pointsList);
        objParent.put("report", obj);


        try {

            FileWriter file = new FileWriter("src/main/java/com/rubiconred/swachhbharat/data/data.json");
            file.write(objParent.toJSONString());
            file.flush();
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        //System.out.print(obj.toJSONString());

    }
}
