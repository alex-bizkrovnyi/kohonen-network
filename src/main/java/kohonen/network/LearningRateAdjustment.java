package kohonen.network;

public class LearningRateAdjustment {
    private static final double START_LEARNING_RATE = 0.1;

    public static double adjustLearningRate(double iteration, int allIterationCount) {
        return START_LEARNING_RATE * Math.exp(-(double)iteration/ allIterationCount);
    }
}
