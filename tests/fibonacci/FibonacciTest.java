
package fibonacci;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class FibonacciTest {
     
       /** Initialise test suite - no-op. */
    @Before
    public void setUp()
    {
    }

    /** Clean up test suite - no-op. */
    @After
    public void tearDown()
    {
    }
   
    /** Test getresult(1). */
    @Test
    public void testFib1()
    {
        assertEquals(1, Fibonacci.getresult(1));
    }

    /** Test getresult(2). */
    @Test
    public void testFib2()
    {
        assertEquals(1, Fibonacci.getresult(2));
    }

   

    /** Test getresult(-1). */
    @Test
    public void testFibMinusOne()
    {
        boolean caught = false;
        try
        {
            Fibonacci.getresult(-1);
        }
        catch (IllegalArgumentException e)
        {
            caught = true;
        }
        assertTrue(caught);
    }
    
}
