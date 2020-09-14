package json.parsing;

import java.util.List;

public class JsonDemoField {
    String id, type, name, batters;
    double ppu;

    JsonDemoField(String id , String type,String name, double ppu, String batters){
      this.id =id;
        this.type = type;
        this.name = name;
        this.ppu = ppu;
        this.batters = batters;
    }


}
