

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestSum
{
    public static void main(String args[]) {
        TestSum test = new TestSum();
        test.test1_5();
        test.test2_8();
        test.test5_15();
    }
    
    /**
     * Default constructor for test class TestMain
     */
    public TestSum()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void test1_5() {
        assertEquals(15, Main.loopSum(1,5));
    }
    
    @Test
    public void test2_8(){
      assertEquals(35, Main.loopSum(2,8));
    }

    @Test
    public void test5_15(){
      assertEquals(110, Main.loopSum(5,15));
    }
    
}
