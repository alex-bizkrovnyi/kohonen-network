package kohonen.network;

import kohonen.algorithm.EuclideanDistanceCalculator;
import kohonen.model.TwoDimensionalNeuron;
import kohonen.model.TwoDimensionalVector;

import java.util.Map;

public class BMUSearcher {

    public static String selectBestMatchingUnit(TwoDimensionalVector vector, Map<String, TwoDimensionalNeuron> neurons) {
        double distance = 0;
        Map.Entry<String, TwoDimensionalNeuron> bestMatchingUnit = null;
        for (Map.Entry<String, TwoDimensionalNeuron> neuronEntry : neurons.entrySet()) {
            double calculateDistance = EuclideanDistanceCalculator.calculateDistance(neuronEntry.getValue(), vector);
            if (distance == 0) {
                distance = calculateDistance;
            }
            if (calculateDistance <= distance) {
                distance = calculateDistance;
                bestMatchingUnit = neuronEntry;
            }
        }
        if (bestMatchingUnit == null) {
            throw new IllegalArgumentException("BMU is null");
        }
        return bestMatchingUnit.getKey();
    }
}
