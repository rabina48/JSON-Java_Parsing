package json.parsing.information;

public class Warehouse {
    public String id;
    public String type;
    public  boolean presence;

    public Warehouse(String id, String type, boolean presence) {
        this.id = id;
        this.type = type;
        this.presence = presence;
    }
}
