package com.steven.androidunittestpractice;

import junit.framework.TestCase;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by steven on 8/13/16.
 */
public class CalculatorTest extends TestCase {

    @Test
    public void testAddNumbers() throws Exception {
        int result = Calculator.addNumbers(5, 10, 15, 20, 25);
        assertEquals(75, result);
    }

    @Test
    public void testSubtractNumber() throws Exception {
        int result = Calculator.subtractNumber(100, 20, 20);
        assertEquals(60, result);
    }
}