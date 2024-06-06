import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxSumIntervalTest {

    @Test
    void testFindMaxSumInterval_positiveNumbers() {
        double[] array = {1.0, 2.0, 3.0, 4.0, 5.0};
        MaxSumInterval.Result result = MaxSumInterval.findMaxSumInterval(array);
        assertEquals(15.0, result.maxSum);
        assertEquals(0, result.startIndex);
        assertEquals(4, result.endIndex);
    }

    @Test
    void testFindMaxSumInterval_randomNumbers() {
        double[] array = {1.0, 2.5, -7.0, 4.0, 5.0};
        MaxSumInterval.Result result = MaxSumInterval.findMaxSumInterval(array);
        assertEquals(9, result.maxSum);
        assertEquals(3, result.startIndex);
        assertEquals(4, result.endIndex);
    }

    @Test
    void testFindMaxSumInterval_negativeNumbers() {
        double[] array = {-1.0, -2.5, -7.0, -4.0, -5.0};
        MaxSumInterval.Result result = MaxSumInterval.findMaxSumInterval(array);
        assertEquals(-1, result.maxSum);
        assertEquals(0, result.startIndex);
        assertEquals(0, result.endIndex);
    }

    @Test
    void testFindMaxSumInterval_lastLargestNumber() {
        double[] array = {-1.0, -2.5, 7.0, -4.0, -5.0, 11};
        MaxSumInterval.Result result = MaxSumInterval.findMaxSumInterval(array);
        assertEquals(11, result.maxSum);
        assertEquals(5, result.startIndex);
        assertEquals(5, result.endIndex);
    }

    @Test
    void testFindMaxSumInterval_fistLargestNumber() {
        double[] array = {1.0, -2.5, -7.0, -4.0, -5.0, -11};
        MaxSumInterval.Result result = MaxSumInterval.findMaxSumInterval(array);
        assertEquals(1, result.maxSum);
        assertEquals(0, result.startIndex);
        assertEquals(0, result.endIndex);
    }

    @Test
    void testFindMaxSumInterval_secondLargestNumber() {
        double[] array = {-1.0, 2.5, -7.0, -4.0, -5.0, -11};
        MaxSumInterval.Result result = MaxSumInterval.findMaxSumInterval(array);
        assertEquals(2.5, result.maxSum);
        assertEquals(1, result.startIndex);
        assertEquals(1, result.endIndex);
    }

    @Test
    void testFindMaxSumInterval_penultimateLargestNumber() {
        double[] array = {-1.0, -2.5, -7.0, -4.0, 5.0, -11};
        MaxSumInterval.Result result = MaxSumInterval.findMaxSumInterval(array);
        assertEquals(5, result.maxSum);
        assertEquals(4, result.startIndex);
        assertEquals(4, result.endIndex);
    }

    @Test
    void testFindMaxSumInterval_descendingNumbers() {
        double[] array = {12.0, -9, 7.0, 3.0, 0, -1};
        MaxSumInterval.Result result = MaxSumInterval.findMaxSumInterval(array);
        assertEquals(13, result.maxSum);
        assertEquals(0, result.startIndex);
        assertEquals(3, result.endIndex);
    }

    @Test
    void testFindMaxSumInterval_checkeredLargestNumber() {
        double[] array = {7.0, -9.23, 8.4, -7.0, 23.0, -11};
        MaxSumInterval.Result result = MaxSumInterval.findMaxSumInterval(array);
        assertEquals(24.4, result.maxSum);
        assertEquals(2, result.startIndex);
        assertEquals(4, result.endIndex);
    }
}
