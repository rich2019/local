package test;

import cn.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCalculator {

    @Before
    public void testBefore(){
        System.out.println("before...");
    }
    @After
    public void testAfter(){
        System.out.println("after...");
    }

    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        int re = calculator.add(4, 6);
        System.out.println(re);
        Assert.assertEquals(190,re);
    }

}
