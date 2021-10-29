package kohonen.network;

import kohonen.algorithm.EuclideanDistanceCalculator;
import kohonen.model.TwoDimensionalNeuron;

import java.util.Map;
import java.util.stream.Collectors;

public class NeuronsLabeling {
    public static Map<String, TwoDimensionalNeuron> updateLabels(String neuronId,
                                                                 Map<String, TwoDimensionalNeuron> neurons,
                                                                 double neighbourhoodRadius,
                                                                 String label) {
        TwoDimensionalNeuron bestMatchingUnit = neurons.get(neuronId);
        return neurons.entrySet().stream()
                .peek(neuron -> {
                    if (isNeighbour(bestMatchingUnit, neuron.getValue(), neighbourhoodRadius)) {
                        neuron.getValue().setLabel(label);
                    }
                }).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    private static boolean isNeighbour(TwoDimensionalNeuron bmu, TwoDimensionalNeuron neuron, double radius) {
        return EuclideanDistanceCalculator.calculateDistance(neuron, bmu) <= radius;
    }
}
