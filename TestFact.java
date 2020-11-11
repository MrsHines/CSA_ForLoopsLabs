

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestFact
{
  public static void main(String args[]) {
    TestFact test = new TestFact();
    test.test5();
    test.test8();
    test.test1();
  }
    /**
     * Default constructor for test class TestMain
     */
    public TestFact()
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
    public void test5() {
        assertEquals(120, Main.factorial(5));
    }

    @Test
    public void test8(){
      assertEquals("40320", Main.factorial(8));
    }
    
        @Test
    public void test1(){
      assertEquals(1, Main.factorial(1));
    }
}
