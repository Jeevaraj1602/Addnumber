import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArraySumTest {

    @Test
    public void testArraySum() {
        int[] numbers = {1, 2, 3, 4, 5};

        assertEquals(16, ArraySum.sum(numbers));
    }

    @Test
    public void testEmptyArray() {
        assertEquals(0, ArraySum.sum(new int[]{}));
    }
}
