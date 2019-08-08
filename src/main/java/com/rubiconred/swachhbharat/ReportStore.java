package com.rubiconred.swachhbharat;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class ReportStore {

    private String userName;
    private String phoneNumber;
    private String email;

    public ReportStore(User user, String couponCode, int count, WastageDispose wastageDispose) {
        userName = user.getuName();
        phoneNumber = user.getuPhone();
        email = user.getuEmail();
        JSONObject obj = new JSONObject();
        obj.put("UserName", userName);
        obj.put("PhoneNumber", phoneNumber);
        obj.put("Email", email);
        obj.put("CouponCode", couponCode);
        obj.put("TotalItems", count);

        JSONArray typeList = new JSONArray();
        typeList.addAll(wastageDispose.getWasteTypeItems());
        obj.put("TypeList", typeList);

        JSONArray brandList = new JSONArray();
        brandList.addAll(wastageDispose.getBrandItems());
        obj.put("BrandType", brandList);

        try {

            FileWriter file = new FileWriter("src/main/java/com/rubiconred/swachhbharat/data/data.json");
            file.write(obj.toJSONString());
            file.flush();
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print(obj.toJSONString());

    }
}
