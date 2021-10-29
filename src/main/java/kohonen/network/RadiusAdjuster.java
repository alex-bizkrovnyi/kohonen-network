package kohonen.network;

public class RadiusAdjuster {

    public static double adjustNeighbourhoodRadius(double latticeHeight,
                                                   double latticeWidth,
                                                   int iteration,
                                                   int totalIteration) {
        double latticeRadius = Math.max(latticeWidth, latticeHeight) / 2;
        double timeConstant = totalIteration / Math.log(latticeRadius);
        return latticeRadius * Math.exp(-iteration / timeConstant);
    }
}
