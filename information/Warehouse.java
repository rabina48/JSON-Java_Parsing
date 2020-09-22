package json.parsing.information;

import java.util.List;

public class Warehouse {
    public int id;
    public String type;
    public  boolean presence;

    Warehouse(){

    }

    public Warehouse(int id, String type, boolean presence) {
        this.id = id;
        this.type = type;
        this.presence = presence;
    }
}
