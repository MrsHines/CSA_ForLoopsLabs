import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestGcd
{
  public static void main(String args[]) {
    TestGcd test = new TestGcd();
    test.test5_25();
    test.test21_66();
    test.test15_45();
    test.test4_11();
  }
    /**
     * Default constructor for test class TestMain
     */
    public TestGcd()
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
    public void test5_25() {
        assertEquals(5, Main.gcd(5, 25));
    }
    
    @Test
    public void test21_66(){
      assertEquals(3, Main.gcd(21, 66));
    }

    @Test
    public void test15_45(){
      assertEquals(15, Main.gcd(15, 45));
    }
    
    @Test
    public void test4_11(){
      assertEquals(1, Main.gcd(4, 11));
    }
    
}
