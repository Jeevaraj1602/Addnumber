
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddNumbersTest {

    @Test
    public void testAddition() {
        assertEquals(30, AddNumbers.add(10, 20));
    }
}
