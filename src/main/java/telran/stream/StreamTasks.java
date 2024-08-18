package telran.stream;

import java.util.Random;

public class StreamTasks {
    public static int[] shuffle(int [] arr) {
        Random random = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int randomIndexToSwap = random.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[randomIndexToSwap];
            arr[randomIndexToSwap] = temp;
        }
        return arr;
    }
    
}
