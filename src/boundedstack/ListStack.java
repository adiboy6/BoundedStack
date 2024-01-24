package boundedstack;

import java.util.List;
import java.util.ArrayList;

public class ListStack<E> implements Stack<E> {
    private final List<E> contents;
    private final int capacity;

    public ListStack(int capacity) {
        if(capacity < 0 ) throw new IllegalArgumentException();
        this.capacity = capacity;
        contents = new ArrayList<E>();
    }

    @Override
    public void push(E element) {
        if (element == null) throw new IllegalArgumentException();
        if(contents.size() == capacity) throw new IllegalStateException();
        contents.add(element);
    }

    @Override
    public E pop() {
        if (contents.size() == 0) throw new IllegalStateException();
        return contents.remove(contents.size() - 1);
    }

    @Override
    public int depth() {
        return contents.size();
    }

    @Override
    public int capacity() {
        return capacity;
    }
}
