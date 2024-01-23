package boundedstack;

public class ListStack implements Stack{
    private List<E> contents;
    private final int capacity;

    public ListStack(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void push(Object element) {

    }

    @Override
    public Object pop() {
        return null;
    }

    @Override
    public int depth() {
        return 0;
    }

    @Override
    public int capacity() {
        return 0;
    }
}
