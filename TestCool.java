

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestCool
{
  public static void main(String args[]) {
    TestCool test = new TestCool();
    test.test250();
    test.test1250();
    test.test9500();
    test.test32500();
  }
    /**
     * Default constructor for test class TestMain
     */
    public TestCool()
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
    public void test250() {
        assertEquals(4, Main.countCoolNumbers(250));
    }
    
    @Test
    public void test1250(){
      assertEquals(20, Main.countCoolNumbers(1250));
    }

    @Test
    public void test9500(){
      assertEquals(158, Main.countCoolNumbers(9500));
    }
    
    @Test
    public void test32500(){
      assertEquals(541, Main.countCoolNumbers(32500));
    }
}
