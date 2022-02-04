package com.test.mavenSix;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void evaluateExpression()
    {	
    	Calc obj = new Calc();
    	String e = "1+2+3+4";
    	int sum= obj.evaluate(e);
    	int expected=10;
    	assertEquals(sum, expected);
        //assertTrue( true );
    }
    
    @Test
    public void testAdd()
    {	
    	Calc obj = new Calc();
    	int sum= obj.sum(12,2);
    	int expected=14;
    	assertEquals(sum, expected);
        //assertTrue( true );
    }
    @Test
    public void testMul()
    {	
    	Calc obj = new Calc();
    	int sum= obj.mul(2,4);
    	int expected=8;
    	assertEquals(sum, expected);
        //assertTrue( true );
    }
    @Test
    public void testSub()
    {	
    	Calc obj = new Calc();
    	int sum= obj.sub(10,8);
    	int expected=2;
    	assertEquals(sum, expected);
        //assertTrue( true );
    }
    @Test
    public void testDiv()
    {	
    	Calc obj = new Calc();
    	int sum= obj.div(4,2);
    	int expected=2;
    	assertEquals(sum, expected);
        //assertTrue( true );
    }
    
    
    
    @Test
    public void testDivDouble()
    {	
    	Calc obj = new Calc();
    	double sum= obj.divDouble(4.2, 2);
    	double expected=2.1;
    	// third param as delta : 
    	assertEquals(sum, expected,0.1);
        //assertTrue( true );
    }
    
    
    
    
    
}
