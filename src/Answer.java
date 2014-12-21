
public class Answer {
    private Object value;
    private int index;


    public Answer(Object value, int index) {
        this.index = index;
        this.value = value;
    }


    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
