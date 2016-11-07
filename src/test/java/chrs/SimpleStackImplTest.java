package chrs;

import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class SimpleStackImplTest {

    @Test
    public void testIsEmpty() throws Exception {
        // Given
        SimpleStack stack = new SimpleStackImpl();
        // Then
        assertTrue(stack.isEmpty());
        // When
        stack.push(new Item(0));
        // Then
        assertFalse(stack.isEmpty());
    }

    @Test
    public void getSize() throws Exception {
        // Given
        SimpleStack stack = new SimpleStackImpl();
        // Then
        assertTrue(stack.getSize() == 0);
        // When
        stack.push(new Item(0));
        // Then
        assertTrue(stack.getSize() == 1);
    }

    @Test
    public void push(Item item) throws Exception {
        // Given
        SimpleStack stack = new SimpleStackImpl();
        stack.push(item);
        // Then
        assertSame(item, stack.peek());
        // When
        stack.push(new Item(1));
        // Then
        assertNotSame(item, stack.peek());
    }

    @Test(expected = EmptyStackException.class)
    public void peek() throws Exception {
        // Given
        SimpleStack stack = new SimpleStackImpl();
        Item item = new Item(0);
        stack.push(item);
        // Then
        assertSame(item, stack.peek());
        // When
        stack.push(new Item(1));
        // Then
        assertNotSame(item, stack.peek());
        //Code under test
        stack.pop();
        stack.pop();
        stack.peek();
    }

    @Test
    public void pop() throws Exception {
        // Given
        SimpleStack stack = new SimpleStackImpl();
        Item item = new Item(0);
        stack.push(item);
        // Then
        assertSame(item, stack.pop());
        assertTrue(stack.isEmpty());
        // When
        stack.push(new Item(1));
        stack.push(new Item(2));
        // Then
        stack.pop();
        assertFalse(stack.isEmpty());
        //Code under test
        stack.pop();
        stack.pop();
    }

}