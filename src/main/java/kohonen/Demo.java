package kohonen;

import kohonen.model.TwoDimensionalVector;
import kohonen.neighbourhoods.NeighbourhoodsAlgorithm;
import kohonen.network.Network;

public class Demo {
    public static void main(String[] args) {
        Network network = new Network(4, 10, NeighbourhoodsAlgorithm.GAUSSIAN);
        network.fitModel(DataStorage.EPOCH);
        TwoDimensionalVector predict = new TwoDimensionalVector(5, 7);
        System.out.println(network.getCluster(predict));
    }
}
