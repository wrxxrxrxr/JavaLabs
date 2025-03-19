import java.util.Random;

public class Array {
    private final int[] values;
    private final int[] weights;
    private final Random random;

    public Array(int[] values, int[] weights) {
        if (values.length != weights.length) {
            throw new IllegalArgumentException("Массивы значений и весов должны иметь одинаковую длину.");
        }

        this.values = values;
        this.weights = weights;
        this.random = new Random();
    }

    private int[] createWeightedArray() {
        int totalLength = 0;

        for (int i = 0; i < weights.length; i++) {
            totalLength += weights[i];
        }

        int[] weightedArray = new int[totalLength];
        int index = 0;

        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < weights[i]; j++) {
                weightedArray[index++] = values[i];
            }
        }

        return weightedArray;
    }

    public int getRandomValue() {
        int[] weightedArray = createWeightedArray();
        int randomIndex = random.nextInt(weightedArray.length);
        return weightedArray[randomIndex];
    }
}