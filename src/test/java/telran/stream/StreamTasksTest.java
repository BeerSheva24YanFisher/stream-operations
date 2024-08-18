package telran.stream;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class StreamTasksTest {

    @Test
    void testShuffle() {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] newArr = StreamTasks.shuffle(arr);
        
        assertFalse(Arrays.equals(arr,newArr));
        assertTrue(Arrays.stream(arr).allMatch(x-> Arrays.stream(newArr).anyMatch(y->x==y)) && 
                Arrays.stream(newArr).allMatch(x -> Arrays.stream(arr).anyMatch(y -> x == y)));
    }

}
