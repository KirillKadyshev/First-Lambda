package com.rogers.lambda;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {
    @Test
    public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertEquals("Hello Rogers Team!!!", classUnderTest.handleRequest(null, null));
    }
}
