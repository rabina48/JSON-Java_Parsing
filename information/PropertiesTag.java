package json.parsing.information;

public class PropertiesTag {
    public String type;
    public TagsItem item;

    PropertiesTag(){

    }

    public PropertiesTag(String type, TagsItem item) {
        this.type = type;
        this.item = item;
    }
}
