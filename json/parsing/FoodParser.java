package json.parsing;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class FoodParser {
    static String path1 = "src/json/parsing/FoodFile.json";
    String content = new String(Files.readAllBytes(Paths.get(path1)));
    JSONObject object = new JSONObject(content);
    JSONObject dataObj = object.getJSONObject("batters");
    JSONArray batterArr = dataObj.getJSONArray("batter");
    JSONArray jsonArray =  object.getJSONArray("topping");

    FoodParser() throws IOException {
    }


    protected   Food parseFood() throws IOException {
        Batter batter = new Batter();
        List<Batter> batterobj = new ArrayList<>();
        batter.id = batterArr.toString();
        batter.type =batterArr.toString();

        Food food = new Food();
        JSONObject batters = new JSONObject(object.getJSONObject("batters"));

        Topping topping = new Topping();
        List<Food> toppingObj = new ArrayList<>();
        topping.id = jsonArray.toString();
        topping.type = jsonArray.toString();
        toppingObj.add(food);


        food.id = object.getString("id");
        food.type = object.getString("type");
        food.name = object.getString("name");
        food.ppu = object.getDouble("ppu");
        batterobj.add(batter);


        System.out.println("Id is =" + food.id);
        System.out.println("The Type is = " + food.type);
        System.out.println("The name is = " + food.name);
        System.out.println("The price per use is =" + food.ppu);
        System.out.println("The battter = " + food.batters);

        Food foodStringValue = new Food(food.id, food.type, food.name, food.ppu, batters);
        return foodStringValue;
    }

   protected void display(){


        for (int i = 0; i <batterArr.length(); i++) {
        }
       System.out.println("===========================================");
       System.out.println("batters id = "+(batterArr.getJSONObject(1)).get("id")+" and batters type ="+(batterArr.getJSONObject(1)).get("type"));
       System.out.println();



        for(int i = 0; i < jsonArray.length(); i++){

            System.out.println(jsonArray.getJSONObject(1).getString("id"));
            System.out.println(jsonArray.getJSONObject(1).getString("type"));
        }
       System.out.println("===========================================");
    }





    }

