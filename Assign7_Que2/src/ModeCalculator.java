import java.util.*;

public class ModeCalculator {

    public static int findMode(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : array) {
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                frequencyMap.put(num, 1);
            }
        }
        int mode = 0;
        int maxFrequency = 0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int currentFrequency = entry.getValue();
            if (currentFrequency > maxFrequency) {
                maxFrequency = currentFrequency;
                mode = entry.getKey();
            }
        }

        return mode;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 2, 3, 3, 3, 5};
        int mode = findMode(array);
        System.out.println("Mode of the array is: " + mode);
    }
}
