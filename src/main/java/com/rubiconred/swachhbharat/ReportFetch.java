package com.rubiconred.swachhbharat;


import com.fasterxml.jackson.annotation.JsonRootName;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.Reader;

//`import org.codehaus.jackson.map.DeserializationConfig;
//import org.codehaus.jackson.databind.ObjectMapper;
//import org.codehaus.jackson.map.annotate.JsonRootName;

@JsonRootName(value = "WeightsAndPoints")
public class ReportFetch {

//    public static void main(String[] args) throws ParseException, FileNotFoundException, IOException {
//
//
//
//    }

    public static Object readJsonSimpleDemo(String filename) throws Exception {
        FileReader reader = new FileReader(filename);
        JSONParser jsonParser = new JSONParser();
        return jsonParser.parse(reader);
    }

    public void printValues() throws Exception {


////        JSONParser parser = new JSONParser();
        Reader reader = new FileReader("src/main/java/com/rubiconred/swachhbharat/data/weights.json");
//
////        Gson gson = new Gson();
////        System.out.println(gson.fromJson(reader, ReportDemo.class));
////        ReportDemo reportDemo = gson.fromJson(reader, ReportDemo.class);
//            ObjectMapper objectMapper=new ObjectMapper();
//
//
//        objectMapper.configure(DeserializationFeature.UNWRAP_ROOT_VALUE,true);
//        WeightsAndPoints weights=objectMapper.readValue(reader,WeightsAndPoints.class);
//        JSONObject jsonObject=new JSONObject(weights);
//
//        System.out.println(weights);
//
//
        //Gson gson = new Gson();
////
////        // 1. JSON file to Java object
////        ReportDemo object = gson.fromJson(new FileReader("src/main/java/com/rubiconred/swachhbharat/data/data.json"), ReportDemo.class);
//
//
////        Object jsonObj = parser.parse(reader);
////
////        JSONObject jsonObject = (JSONObject) jsonObj;
////        String type = (String) jsonObject.get("plastic");
////        System.out.println("type = " + type);
////
////
////        String phoneNumber = (String) jsonObject.get("PhoneNumber");
////        System.out.println("Age = " + phoneNumber);

////        JSONObject mainObject=new JSONObject("src/main/java/com/rubiconred/swachhbharat/data/weights.json");
//        ObjectMapper objectMapper=new ObjectMapper();

//        System.out.println(jsonArray.get(0));
//        System.out.println(jsonArray.get(1));
//        JSONObject jsonObject= (JSONObject) jsonArray.get(0);
//        System.out.println("JS "+jsonObject);
//
////        WeightsAndPoints weights=objectMapper.readValues(jsonObject,WeightsAndPoints.class);
////        WeightsAndPoints weights1= gson.fromJson(String.valueOf(weightsObject),WeightsAndPoints.class);
//        System.out.println("getweights="+jsonObject.get("weight"));
//        JSONObject object = (JSONObject) readJsonSimpleDemo("src/main/java/com/rubiconred/swachhbharat/data/weights.json");
//        JSONObject weightsObject = (JSONObject) object.get("weights");
//        JSONArray jsonArray = (JSONArray) weightsObject.get("waste");
//
//
//        for (int i = 0; i < jsonArray.size(); i++) {
//
//            JSONObject newObject = (JSONObject) jsonArray.get(i);
//            weights.setBrand(newObject.get("brand").toString());
//            weights.setType(newObject.get("type").toString());
//            weights.setWeight(Integer.parseInt(newObject.get("weight").toString()));
//            System.out.println(weights.toString());
//        }


//        System.out.println(object);
//        System.out.println(weightsObject);
//      //  System.out.println(wasteAray);
//      System.out.println(jsonArray);


    }


}
