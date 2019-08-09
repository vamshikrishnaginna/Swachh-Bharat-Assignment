package com.rubiconred.swachhbharat;


import com.google.gson.Gson;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class ReportFetch {

//    public static void main(String[] args) throws ParseException, FileNotFoundException, IOException {
//
//
//
//    }

    public void printValues() throws IOException, ParseException {


//        JSONParser parser = new JSONParser();
//        Reader reader = new FileReader("src/main/java/com/rubiconred/swachhbharat/data/weights.json");
//        Gson gson = new Gson();
//        ReportDemo reportDemo = gson.fromJson(reader, ReportDemo.class);
//        System.out.println(reportDemo);
//        System.out.println("");

        Gson gson = new Gson();

        // 1. JSON file to Java object
        ReportDemo object = gson.fromJson(new FileReader("src/main/java/com/rubiconred/swachhbharat/data/data.json"), ReportDemo.class);


//        Object jsonObj = parser.parse(reader);
//
//        JSONObject jsonObject = (JSONObject) jsonObj;
//        String type = (String) jsonObject.get("plastic");
//        System.out.println("type = " + type);
//
//
//        String phoneNumber = (String) jsonObject.get("PhoneNumber");
//        System.out.println("Age = " + phoneNumber);

    }


}
