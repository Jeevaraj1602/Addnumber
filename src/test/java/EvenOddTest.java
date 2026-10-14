import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenOddTest {

    @Test
    public void testEvenNumber() {
        assertEquals("Even", EvenOdd.check(8));
    }

    @Test
    public void testOddNumber() {
        assertEquals("Odd", EvenOdd.check(7));
    }
}
