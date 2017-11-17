package HelloWorld;

import static org.junit.Assert.*;

import org.junit.Test;


public class HelloWorldControllerTest {
 
    @Test
    public void testSayHello() {
        assertEquals("Hello,World!",new HelloWorldController().sayHello());
    }
}