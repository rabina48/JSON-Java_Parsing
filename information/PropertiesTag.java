package json.parsing.information;

public class PropertiesTag {
    public String type;
    public TagsItem items;

    PropertiesTag(){

    }

    public PropertiesTag(String type, TagsItem items) {
        this.type = type;
        this.items = items;
    }
}
