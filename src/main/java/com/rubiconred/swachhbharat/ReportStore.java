package com.rubiconred.swachhbharat;

import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class ReportStore {

    private String userName;
    private String phoneNumber;
    private String email;

    public ReportStore(User user) {
        userName = user.getuName();
        phoneNumber = user.getuPhone();
        email = user.getuEmail();
        JSONObject obj = new JSONObject();
        obj.put("UserName", userName);
        obj.put("PhoneNumber", phoneNumber);
        obj.put("Email", email);
        try {

            FileWriter file = new FileWriter("data.json");
            file.write(obj.toJSONString());
            file.flush();
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print(obj.toJSONString());

    }
}
