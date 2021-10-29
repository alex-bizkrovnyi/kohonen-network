package kohonen.network;

import kohonen.model.Input;
import kohonen.model.TwoDimensionalNeuron;
import kohonen.model.TwoDimensionalVector;
import kohonen.neighbourhoods.GaussianNeighbourWeightsUpdating;
import kohonen.neighbourhoods.LinearNeighbourWeightsUpdating;
import kohonen.neighbourhoods.NeighbourWeightsUpdateFunction;
import kohonen.neighbourhoods.NeighbourhoodsAlgorithm;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Network {
    private Map<String, TwoDimensionalNeuron> neurons;
    private final int iterationCount;
    private final NeighbourWeightsUpdateFunction weightsUpdateFunction;
    private double learningRate;
    private double neighbourRadius;
    private final int clusterCount;

    public Network(int clustersCount, int iterationCount, NeighbourhoodsAlgorithm neighbourhoodsAlgorithm) {
        this.iterationCount = iterationCount;
        this.clusterCount = clustersCount;
        neurons = initNeurons(clustersCount);
        weightsUpdateFunction = initUpdateFunction(neighbourhoodsAlgorithm);
    }

    private NeighbourWeightsUpdateFunction initUpdateFunction(NeighbourhoodsAlgorithm algorithmType) {
        return algorithmType == NeighbourhoodsAlgorithm.GAUSSIAN
                ? new GaussianNeighbourWeightsUpdating()
                : new LinearNeighbourWeightsUpdating();
    }

    private Map<String, TwoDimensionalNeuron> initNeurons(int clustersCount) {
        return IntStream.range(0, clustersCount * clustersCount).mapToObj(i -> {
            TwoDimensionalNeuron twoDimensionalNeuron = new TwoDimensionalNeuron();
            twoDimensionalNeuron.setFirstDimensionWeight(new Random().nextDouble());
            twoDimensionalNeuron.setSecondDimensionWeight(new Random().nextDouble());
            return twoDimensionalNeuron;
        }).collect(Collectors.toMap(x -> UUID.randomUUID().toString(), y -> y));
    }

    private void oneFitting(List<Input> epoch, int indexOfInputToTrain) {
        epoch.forEach(input -> {
            TwoDimensionalVector twoDimensionalVector = input.getVectors().get(indexOfInputToTrain);
            String neuronId = BMUSearcher.selectBestMatchingUnit(twoDimensionalVector, neurons);
            neurons = weightsUpdateFunction.updateNeighbours(twoDimensionalVector, neurons.get(neuronId), neurons, neighbourRadius, learningRate);
            neurons = NeuronsLabeling.updateLabels(neuronId, neurons, neighbourRadius, input.getLabel());
        });
    }

    public void fitModel(List<Input> epoch) {
        IntStream.range(0, iterationCount).forEach(i -> {
            learningRate = LearningRateAdjustment.adjustLearningRate(i, iterationCount);
            neighbourRadius = RadiusAdjuster.adjustNeighbourhoodRadius(clusterCount, clusterCount, i, iterationCount);
            oneFitting(epoch, i);
        });
    }

    public String getCluster(TwoDimensionalVector vector) {
        String neuronId = BMUSearcher.selectBestMatchingUnit(vector, neurons);
        return neurons.get(neuronId).getLabel();
    }
}
