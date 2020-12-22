
package solution;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

import com.solution.Solution;

public class SolutionTest {

    /** Test getresult(1). */
    @Test
    public void testFib1()
    {
        assertEquals(1, Solution.getresult(1));
    }

    /** Test getresult(2). */
    @Test
    public void testFib2()
    {
        assertEquals(1, Solution.getresult(2));
    }


    /** Test getresult(-1). */
    @Test
    public void testFibMinusOne()
    {
        boolean caught = false;
        try
        {
            Solution.getresult(-1);
        }
        catch (IllegalArgumentException e)
        {
            caught = true;
        }
        assertTrue(caught);
    }

}
