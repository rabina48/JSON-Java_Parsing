package json.parsing.information;

import java.util.List;

public class Info {
    public String $schema;
    public String title;
    public String type;
    public List<String> required;
    public Properties properties;

    Info(){

    }
    protected Info(String $schema, String title, String type, List<String> required, Properties properties) {
        this.$schema = $schema;
        this.title = title;
        this.type = type;
        this.required = required;
        this.properties = properties;
    }
}
