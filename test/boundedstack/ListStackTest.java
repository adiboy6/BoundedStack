package boundedstack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ListStackTest {

    private Stack<String> empty3;
    private Stack<String> abc6;

    @Before
    public void setUp() throws Exception {
        empty3 = new ListStack<>(3);
        abc6 = new ListStack<>(6);
        abc6.push("A");
        abc6.push("B");
        abc6.push("C");
    }

    @org.junit.Test
    public void testInitialStack() {
        Assert.assertEquals(3, empty3.capacity());
        Assert.assertEquals(0,empty3.depth());
    }

    @Test(expected = IllegalArgumentException.class)
    public void pushException() {
        empty3.push(null);
        fail();
    }

    @Test(expected = IllegalStateException.class)
    public void pushCapacityOverflowException() {
        abc6.push("D");
        abc6.push("E");
        abc6.push("F");
        abc6.push("G");
        fail();
        abc6.pop();
        abc6.pop();
        abc6.pop();
    }

    @org.junit.Test
    public void pop() {
        Assert.assertEquals("C", abc6.pop());
        Assert.assertEquals("B", abc6.pop());
        Assert.assertEquals("A", abc6.pop());
    }

    @Test(expected = IllegalStateException.class)
    public void popException() {
        empty3.pop();
        fail();
    }

}