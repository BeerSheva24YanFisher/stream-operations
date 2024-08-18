package telran.stream;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class StreamTasksTest {

    @Test
    void testShuffle() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] originalArr = arr.clone();

        StreamTasks.shuffle(arr);
        boolean isShuffled = !Arrays.equals(originalArr, arr);
        boolean hasSameElements = Arrays.equals(originalArr, Arrays.stream(arr).sorted().toArray());
        
        assertTrue(isShuffled);
        assertTrue(hasSameElements);
    }

}
