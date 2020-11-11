import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestisPrime
{
  public static void main(String args[]) {
    TestisPrime test = new TestisPrime();
    test.test24();
    test.test100();
    test.test7919();
    test.test2();
    test.test113();
  }
    /**
     * Default constructor for test class TestMain
     */
    public TestPrime()
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
    public void test24() {
        assertEquals(false, Main.isPrime(24));
    }
    
    @Test
    public void test100(){
      assertEquals(false, Main.isPrime(100));
    }

    @Test
    public void test7919(){
      assertEquals(true, Main.isPrime(7919));
    }
    
    @Test
    public void test2(){
      assertEquals(true, Main.isPrime(2));
    }
    
    @Test
    public void test113(){
      assertEquals(true, Main.isPrime(113));
    }
    
}
