package practice.json;

import java.util.List;

public class AllOf {
    public String $ref;
    public AllOfProperties properties;
    public List<String> required;

    public AllOf(String $ref, AllOfProperties properties, List<String> required) {

        this.$ref = $ref;
        this.properties = properties;
        this.required = required;
    }
}
