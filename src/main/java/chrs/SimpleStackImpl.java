package chrs;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * Created by 21506406 on 03/11/2016.
 */
public class SimpleStackImpl implements SimpleStack {
    ArrayList<Object> wrappedStack = new ArrayList<Object>();

    public boolean isEmpty(){
        return wrappedStack.isEmpty();
    }

    public void push(Item item){
        wrappedStack.add(item);
    }

    public int getSize(){
        return wrappedStack.size();
    }

    public Item peek() throws EmptyStackException{
        return (Item) wrappedStack.get(wrappedStack.size()-1);
    }

    public Item pop() throws EmptyStackException{
        Item item = peek();
        wrappedStack.remove(wrappedStack.size()-1);
        return item;
    }
}
