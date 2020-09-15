package json.parsing;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class FoodParser {
    static String path1 = "src/json/parsing/FoodFile.json";
    String content = new String(Files.readAllBytes(Paths.get(path1)));
    JSONObject object = new JSONObject(content);

    FoodParser() throws IOException {
    }


    protected   Food parseFood() throws IOException {


        Food food = new Food();
        JSONObject batters = new JSONObject(object.getJSONObject("batters"));

        food.id = object.getString("id");
        food.type = object.getString("type");
        food.name = object.getString("name");
        food.ppu = object.getDouble("ppu");
       // food.batters = object.getString("batters");
        //food.topping =  object.getString("topping");

        System.out.println("Id is =" + food.id);
        System.out.println("The Type is = " + food.type);
        System.out.println("The name is = " + food.name);
        System.out.println("The price per use is =" + food.ppu);
        System.out.println("The battter = " + food.batters);

        Food foodStringValue = new Food(food.id, food.type, food.name, food.ppu, batters);
        Batter batter = new Batter();

//        batter.id = batters.getString("id");
//        batter.type = batters.getString("type");


        return foodStringValue;
    }

   protected void display(){

        JSONObject dataObj = object.getJSONObject("batters");
        JSONArray batterArr = dataObj.getJSONArray("batter");
        for (int i = 0; i <batterArr.length(); i++) {

            System.out.println(((JSONObject)batterArr.get(i)).get("id"));
            System.out.println(((JSONObject)batterArr.get(i)).get("type"));
        }
       System.out.println("===========================================");


        JSONArray jsonArray =  object.getJSONArray("topping");
        //ist<String> list = new ArrayList<String>();
        for(int i = 0; i < jsonArray.length(); i++){

            System.out.println(jsonArray.getJSONObject(i).getString("id"));
            System.out.println(jsonArray.getJSONObject(i).getString("type"));
        }
       System.out.println("===========================================");
    }





    }

