package com.fss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        App app = new App();
        int expected = 10;
        int actual = app.sum(5, 5);
        assertEquals(expected, actual);
    }
}
