package practice.json;

import java.util.List;

public class Address {
    public String type;
    public DefinitionsProperties definitionsProperties;
    public List<String> required;

    Address(){

    }
    public Address(String type, DefinitionsProperties definitionsProperties, List<String> required) {
        this.type = type;
        this.definitionsProperties = definitionsProperties;
        this.required = required;
    }
}

