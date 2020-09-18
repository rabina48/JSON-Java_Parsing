package json.parsing.information;

import java.util.List;

public class StockProperties {
public  List<Warehouse> warehouse;
public Retail retail;

StockProperties(){

}
    public StockProperties(List<Warehouse> warehouse, Retail retail) {
        this.warehouse = warehouse;
        this.retail = retail;
    }
}
