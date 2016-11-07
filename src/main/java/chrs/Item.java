package chrs;

/**
 * Created by 21506406 on 03/11/2016.
 */
public class Item {
    private Object value;

    public Item(Object value){
        setValue(value);
    }

    public Object getValue(){
        return value;
    }

    public void setValue(Object value){
        this.value = value;
    }
}
