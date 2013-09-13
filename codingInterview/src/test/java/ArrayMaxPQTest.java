import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Fujinuma
 * Date: 2013/09/13
 * Time: 22:41
 * To change this template use File | Settings | File Templates.
 */
public class ArrayMaxPQTest {
    @Test
    public void test() {
        ArrayMaxPQ<Integer> pq = new ArrayMaxPQ<Integer>(6);
        int[] input = {60, 20, 50, 10, 30, 40};
        for (int in : input) {
            pq.insert(in);
        }

        int[] output = new int[6];
        int in = 0;
        while (!pq.isEmpty()) {
            int temp = pq.delMax();
            output[in++] = temp;
        }
        Arrays.sort(input);
        for(int j = input.length -1, i = 0; j >= input.length/2; j--, i++) {
            int temp = input[i];
            input[i] = input[j];
            input[j] = temp;
        }
        assertArrayEquals(input, output);
    }
}
