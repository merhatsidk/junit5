import org.example.Hello;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HelloTest {

    @Test
    public void testHello(){
        Hello h = new Hello();
        assertEquals("Hello, World !!", h.hello());

    }
}
