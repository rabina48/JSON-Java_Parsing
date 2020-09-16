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
        batter.id = batterArr.getJSONObject(1).getString("id");
        batter.type =batterArr.getJSONObject(1).getString("type");

        Food food = new Food();
        JSONObject batters = new JSONObject(object.getJSONObject("batters"));

        Topping topping = new Topping();
        List<Food> toppingObj = new ArrayList<>();
        topping.id = jsonArray.getJSONObject(1).getString("id");
        topping.type = jsonArray.getJSONObject(1).getString("type");
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
        System.out.println("The battters = " + food.batters);
        System.out.println("The batter = " + batter.id+" and its type is = "+batter.type);
        System.out.println("The topping = " + topping.id+" and type is = "+topping.type);



        Food foodStringValue = new Food(food.id, food.type, food.name, food.ppu, batters);
        return foodStringValue;
    }

   protected void display(){


        for (int i = 0; i <batterArr.length(); i++) {
            System.out.println("===========================================");
            System.out.println("Batters id = "+(batterArr.getJSONObject(i)).get("id"));
            System.out.println(" and  type ="+(batterArr.getJSONObject(i)).get("type"));
        }

       System.out.println();
        for(int i = 0; i < jsonArray.length(); i++){
            System.out.println("Topping id = "+jsonArray.getJSONObject(i).getString("id"));
            System.out.println(" and type is ="+jsonArray.getJSONObject(i).getString("type"));
        }
       System.out.println("===========================================");
       // String val =jsonArray.getJSONObject(1).getString("id");

       System.out.println();
    }





    }

