package telran.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class StreamTasksTest {

    @Test
    void testShuffle() {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] newArr = StreamTasks.shuffle(arr);
        
        assertTrue(IntStream.range(0, arr.length).anyMatch(i -> newArr[i] != arr[i]));
        assertArrayEquals(Arrays.stream(arr).sorted().toArray(), Arrays.stream(newArr).sorted().toArray());
    }

}
