package json.parsing.information;

public class PropertiesStock {
    public String type;
    public StockProperties properties;

    PropertiesStock(){

    }

    public PropertiesStock(String type, StockProperties properties) {
        this.type = type;
        this.properties = properties;
    }
}
