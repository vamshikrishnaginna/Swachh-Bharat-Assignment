package com.rubiconred.swachhbharat;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReportFetch {

//    public static void main(String[] args) throws ParseException, FileNotFoundException, IOException {
//
//
//
//    }

    public void printValues() throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        Reader reader = new FileReader("src/main/java/com/rubiconred/swachhbharat/data/data.json");

        Object jsonObj = parser.parse(reader);

        JSONObject jsonObject = (JSONObject) jsonObj;
        String name = (String) jsonObject.get("UserName");
        System.out.println("Name = " + name);

        String phoneNumber = (String) jsonObject.get("PhoneNumber");
        System.out.println("Age = " + phoneNumber);

    }


}
