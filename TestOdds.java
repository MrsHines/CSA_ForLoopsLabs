

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestOdds
{
  public static void main(String args[]) {
    TestOdds test = new TestOdds();
    test.test1_5();
    test.test2_8();
    test.test5_15();
  }
    /**
     * Default constructor for test class TestMain
     */
    public TestOdds()
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
        assertEquals(3, Main.countOdds(1,5));
    }
    
    @Test
    public void test2_8(){
      assertEquals(3, Main.countOdds(2,8));
    }

    @Test
    public void test5_15(){
      assertEquals(6, Main.countOdds(5,15));
    }

  
    
    
}
