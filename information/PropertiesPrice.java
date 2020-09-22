package json.parsing.information;

public class PropertiesPrice {
    public String type;
    public int minimum;
    public PropertiesPrice price;

    PropertiesPrice(){

    }
    PropertiesPrice(String type,int minimum){
        this.type = type;
        this.minimum = minimum;



    }
}
