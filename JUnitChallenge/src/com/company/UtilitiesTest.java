package com.company;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class UtilitiesTest {
    @org.junit.Test
    public void everyNthChar() throws Exception {
        fail("This test has not been implemented");
    }

    @org.junit.Test
    public void removePairs() throws Exception {
        Utilities util = new Utilities();
        assertEquals("ABCDEF", util.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", util.removePairs("ABCCABDEEF"));
    }

    @org.junit.Test
    public void converter() throws Exception {
        fail("This test has not been implemented");
    }

    @org.junit.Test
    public void nullIfOddLength() throws Exception {
        fail("This test has not been implemented");
    }

}