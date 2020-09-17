package json.parsing.information;

public class Properties {
    public PropertiesId id;
    public PropertiesName name;
    public PropertiesPrice price;
    public PropertiesTag tags;
    public PropertiesStock stock;

    public Properties(PropertiesId id, PropertiesName name, PropertiesPrice price, PropertiesTag tags, PropertiesStock stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.tags = tags;
        this.stock = stock;
    }
}
