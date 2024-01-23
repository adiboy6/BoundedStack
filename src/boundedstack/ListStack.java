package boundedstack;

import java.util.List;

public class ListStack<E> implements Stack<E> {
    private List<E> contents;
    private final int capacity;

    public ListStack(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void push(E element) {
        if(contents.size()<capacity) contents.add(element);
    }

    @Override
    public E pop() {
        E lastEle = contents.getLast();
        contents.remove(0);
        return lastEle;
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
