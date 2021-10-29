package kohonen.neighbourhoods;

import kohonen.model.TwoDimensionalNeuron;
import kohonen.model.TwoDimensionalVector;
import kohonen.network.Network;

import java.util.Map;

public class LinearNeighbourWeightsUpdating implements NeighbourWeightsUpdateFunction {

    @Override
    public Map<String, TwoDimensionalNeuron> updateNeighbours(TwoDimensionalVector vector, TwoDimensionalNeuron bmu, Map<String, TwoDimensionalNeuron> neurons, double radius, double learningRate) {
        return null;
    }
}
