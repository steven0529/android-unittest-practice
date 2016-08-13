package com.steven.androidunittestpractice;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by steven on 8/13/16.
 */
public class ChuckMathTestTest extends TestCase {

    @Before
    public void setUp() throws Exception {
        // Called on Start
    }

    @After
    public void tearDown() throws Exception {
        // Called on End
    }

    @Test
    public void testAdd() throws Exception {
        int result = ChuckMathTest.add(10, 10);
        assertEquals(20, result);
    }

    @Test
    public void testSubtract() throws Exception {
        int result = ChuckMathTest.subtract(20, 10);
        assertEquals(10, result);
    }

    @Test
    public void testMultiply() throws Exception {
        int result = ChuckMathTest.multiply(10, 2);
        assertEquals(20, result);
    }

    @Test
    public void testDivide() throws Exception {
        int result = ChuckMathTest.divide(9, 3);
        assertEquals(3, result);
    }
}