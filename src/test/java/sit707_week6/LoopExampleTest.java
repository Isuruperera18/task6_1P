package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class LoopExampleTest {

    @Test
    public void testSumToN() {
        // Test the sum from 1 to n
        Assert.assertEquals(15, LoopExample.sumToN(5)); // 1 + 2 + 3 + 4 + 5
        Assert.assertEquals(55, LoopExample.sumToN(10)); // 1 to 10
    }

    @Test
    public void testCountDivisibles() {
        // Test the count of numbers from 1 to n divisible by a divisor
        Assert.assertEquals(2, LoopExample.countDivisibles(10, 5)); // 5 and 10
        Assert.assertEquals(3, LoopExample.countDivisibles(12, 4)); // 4, 8, 12
    }
}
