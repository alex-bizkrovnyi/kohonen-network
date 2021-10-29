package kohonen.algorithm;

import kohonen.model.TwoDimensionalNeuron;
import kohonen.model.TwoDimensionalVector;

public class EuclideanDistanceCalculator {
    public static double calculateDistance(TwoDimensionalNeuron neuron, TwoDimensionalVector vector) {
        double firstOperand = Math.pow((vector.getFirstDimension() - neuron.getFirstDimensionWeight()), 2);
        double secondOperand = Math.pow((vector.getSecondDimension() - neuron.getSecondDimensionWeight()), 2);
        return Math.sqrt(firstOperand + secondOperand);
    }

    public static double calculateDistance(TwoDimensionalNeuron otherNeuron, TwoDimensionalNeuron bmu) {
        double firstOperand = Math.pow((bmu.getFirstDimensionWeight() - otherNeuron.getFirstDimensionWeight()), 2);
        double secondOperand = Math.pow((bmu.getSecondDimensionWeight() - otherNeuron.getSecondDimensionWeight()), 2);
        return Math.sqrt(firstOperand + secondOperand);
    }
}
