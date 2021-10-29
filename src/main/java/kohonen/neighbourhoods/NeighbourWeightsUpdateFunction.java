package kohonen.neighbourhoods;

import kohonen.model.TwoDimensionalNeuron;
import kohonen.model.TwoDimensionalVector;

import java.util.Map;

public interface NeighbourWeightsUpdateFunction {
    Map<String, TwoDimensionalNeuron> updateNeighbours(TwoDimensionalVector vector,
                                                       TwoDimensionalNeuron bmu,
                                                       Map<String, TwoDimensionalNeuron> neurons,
                                                       double radius,
                                                       double learningRate);
}
