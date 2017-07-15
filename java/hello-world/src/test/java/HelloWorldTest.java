import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {


    @Test
    public void helloNoName() {
        assertEquals("Hello, World!", HelloWorld.hello(""));
        assertEquals("Hello, World!", HelloWorld.hello(null));
    }

    @Test
    public void emptyStringIsComparedByValue() {
        assertEquals("Hello, World!", HelloWorld.hello(new String("")));
    }
    
    @Test
    public void helloSampleName() {
        assertEquals("Hello, Alice!", HelloWorld.hello("Alice"));
    }

    @Test
    public void helloAnotherSampleName() {
        assertEquals("Hello, Bob!", HelloWorld.hello("Bob"));
    }
}
