package json.parsing;


import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    static String path1 = "src/json/parsing/FoodFile.json";
    public static void main(String[] args){

        FileReader fileReader = new FileReader(path1);
        fileReader.read();
        jsonParser();


    }

    public  static void jsonParser( ){

        try {
            String content = new String(Files.readAllBytes(Paths.get(path1)));
            JSONObject object = new JSONObject(content);
            String id = object.getString("id");
            System.out.println("Id is ="+id);

            String type = object.getString("type");
            System.out.println("The Type is = "+type);

            String name = object.getString("name");
            System.out.println("The name is = "+name);

//            String ppu = object.getDouble(ppu);
//            System.out.println("The price per use is ="+ppu);

        } catch (IOException e) {
            e.printStackTrace();
        }





//
//        JSONArray arr = object.getJSONArray("batter");
//        for (int i = 0; i < arr.length(); i++) {
//            String id = arr.getJSONObject(i).getString("post_id");
//            System.out.println(id);
//        }



    }
}
