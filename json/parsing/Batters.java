package json.parsing;

import org.json.JSONObject;

import java.util.List;

public class Batters {
     List<Batter> batter;
    List<Batter> topping;
       Batters(){

       }

       Batters( List<Batter> batter, List<Batter> topping) {
        this.batter = batter;
        this.topping = topping;
    }


    public Batters(JSONObject batter) {
    }
}
