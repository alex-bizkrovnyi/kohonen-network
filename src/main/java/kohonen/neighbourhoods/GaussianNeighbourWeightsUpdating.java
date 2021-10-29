package kohonen.neighbourhoods;

import kohonen.Tuple;
import kohonen.algorithm.EuclideanDistanceCalculator;
import kohonen.model.TwoDimensionalNeuron;
import kohonen.model.TwoDimensionalVector;

import java.util.Map;
import java.util.stream.Collectors;

public class GaussianNeighbourWeightsUpdating implements NeighbourWeightsUpdateFunction {


    private double getGaussianDistanceFalloff(double radius, double distanceBetweenNeurons) {
        return Math.exp(-(Math.pow(distanceBetweenNeurons, 2)) / (2 * Math.pow(radius, 2)));
    }

    private double adjustWeight(double currentNeuronWeight, double currentVectorWeight, double distanceFalloff, double learningRate) {
        return currentNeuronWeight + (distanceFalloff * learningRate * (currentVectorWeight - currentNeuronWeight));
    }

    private Tuple<Double, Double> adjustWeights(TwoDimensionalVector vector, TwoDimensionalNeuron neuron,
                                                double learningRate, double distanceFalloff) {
        double updatedFirstDimWeight = adjustWeight(neuron.getFirstDimensionWeight(), vector.getFirstDimension(), distanceFalloff, learningRate);
        double updatedSecondDimWeight = adjustWeight(neuron.getSecondDimensionWeight(), vector.getSecondDimension(), distanceFalloff, learningRate);
        return new Tuple<>(updatedFirstDimWeight, updatedSecondDimWeight);
    }

    @Override
    public Map<String, TwoDimensionalNeuron> updateNeighbours(TwoDimensionalVector vector,
                                                              TwoDimensionalNeuron bmu,
                                                              Map<String, TwoDimensionalNeuron> neurons,
                                                              double radius,
                                                              double learningRate) {
        return neurons.entrySet().stream()
                .peek(entry -> {
                    double distanceBetweenNeurons = EuclideanDistanceCalculator.calculateDistance(bmu, entry.getValue());
                    if (distanceBetweenNeurons <= radius) {
                        double gaussian = getGaussianDistanceFalloff(radius, distanceBetweenNeurons);
                        Tuple<Double, Double> newWeights = adjustWeights(vector, bmu, learningRate, gaussian);
                        entry.getValue().setFirstDimensionWeight(newWeights.getLeft());
                        entry.getValue().setSecondDimensionWeight(newWeights.getRight());
                    }
                }).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
