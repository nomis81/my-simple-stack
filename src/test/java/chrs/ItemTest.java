package chrs;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void testGetValue() throws Exception {
        // Given
        Item item = new Item(0);
        // Then
        assertSame(0, item.getValue());
    }

    @Test
    public void testSetValue() throws Exception {
        // Given
        Item item = new Item(0);
        item.setValue(1);
        // Then
        assertSame(1, item.getValue() );
    }
    /* #3 */
    azeezr
}