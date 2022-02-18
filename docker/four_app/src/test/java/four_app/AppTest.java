/**
 * 
 */
package four_app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest 
{
    
    @Test
    public void testAdd()
    {	
    	Calc obj = new Calc();
    	int sum= obj.sum(12);
    	int expected=12;
    	assertEquals(sum, expected);
        //assertTrue( true );
    }
    
    @Test
    public void testAdd1()
    {	
    	Calc obj = new Calc();
    	int sum= obj.sum(1,2,3,4,5);
    	int expected=15;
    	assertEquals(sum, expected);
        //assertTrue( true );
    }
    
    @Test
    public void testAdd2()
    {	
    	Calc obj = new Calc();
    	Object[] a = {"1","2",3,4,5};
    	int sum= obj.sum(a);
    	int expected=15;
    	assertEquals(sum, expected);
        //assertTrue( true );
    }
    
    
    @Test
    public void testAdd3()
    {	
    	Calc obj = new Calc();
    	int sum= obj.sum();
    	int expected=0;
    	assertEquals(sum, expected);
        //assertTrue( true );
    }
    
    
    @Test
    public void testAdd4()
    {	
    	Calc obj = new Calc();
    	int sum= obj.sum(1,2);
    	int expected=3;
    	assertEquals(sum, expected);
        //assertTrue( true );
    }
    
    @Test
    public void testAdd5()
    {	
    	Calc obj = new Calc();
    	int sum= obj.sum(10);
    	int expected=10;
    	assertEquals(sum, expected);
        //assertTrue( true );
    }
    
    
    @Test
    public void testAdd6()
    {	
    	Calc obj = new Calc();
    	Object a[] = {1,"2","three", "four",5};
    	int sum= obj.sum(a);
    	int expected=15;
    	assertEquals(sum, expected);
        //assertTrue( true );
    }
    
    
    
    
    
    
    
}

