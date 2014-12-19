import java.util.List;

public class Question {

    private String name;
    private List<Object> options;
    private String type;

    public Question(String name, String type, List<Object> options) {
        this.name = name;
        this.options = options;
        this.type = type;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Object> getOptions() {
        return options;
    }

    public void setOptions(List<Object> options) {
        this.options = options;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
