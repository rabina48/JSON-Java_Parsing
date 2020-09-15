package json.parsing;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

 public class Food {
    public String id;
    public String type;
    public String name;
    public double ppu;
    public String batters;
    public List<Topping> topping;

    Food() {}

    Food(String id, String type, String name, double ppu, Batters batters, List<Topping> topping){
        this.id = id;
        this.type = type;
        this.name =name;
        this.ppu = ppu;

        this.topping = topping;
    }


     public Food(String id, String type, String name, double ppu, JSONObject batters) {

         Food food = new Food();
     }
 }








