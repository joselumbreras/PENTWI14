package com.pentwi14.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.pentwi14.Factorial;

@RunWith(JUnit4.class)
public class FactorialTest {

    private Factorial instance;

    @Before
    public void setup() {
        instance = new Factorial();
    }

    @Test(expected = IllegalArgumentException.class)
    public void Test_FactorialOfNegativeNumberIsUndefined() {
        int n = -1;
        instance.factorial(n);
    }

    @Test
    public void Test_FactorialOf_0_Is_0() {
        int n = 0;
        int result = instance.factorial(n);
        Assert.assertEquals(1, result);
    }

    @Test
    public void Test_FactorialOf_1_Is_1() {
        int n = 1;
        int result = instance.factorial(n);
        Assert.assertEquals(1, result);
    }

    @Test
    public void Test_FactorialOf_2_Is_2() {
        int n = 2;
        int result = instance.factorial(n);
        Assert.assertEquals(2, result);
    }

    @Test
    public void Test_FactorialOf_3_Is_6() {
        int n = 3;
        int result = instance.factorial(n);
        Assert.assertEquals(6, result);
    }

    @Test
    public void Test_FactorialOf_4_Is_24() {
        int n = 4;
        int result = instance.factorial(n);
        Assert.assertEquals(24, result);
    }

    @Test
    public void Test_FactorialOf_5_Is_120() {
        int n = 5;
        int result = instance.factorial(n);
        Assert.assertEquals(120, result);
    }

}
