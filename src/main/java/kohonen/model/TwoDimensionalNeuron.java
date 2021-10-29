package kohonen.model;


public class TwoDimensionalNeuron {

    private double firstDimensionWeight;
    private double secondDimensionWeight;
    private String label;

    public String getLabel() {
        return label;
    }

    public TwoDimensionalNeuron setLabel(String label) {
        this.label = label;
        return this;
    }

    public double getFirstDimensionWeight() {
        return firstDimensionWeight;
    }

    public TwoDimensionalNeuron setFirstDimensionWeight(double firstDimensionWeight) {
        this.firstDimensionWeight = firstDimensionWeight;
        return this;
    }

    public double getSecondDimensionWeight() {
        return secondDimensionWeight;
    }

    public TwoDimensionalNeuron setSecondDimensionWeight(double secondDimensionWeight) {
        this.secondDimensionWeight = secondDimensionWeight;
        return this;
    }
}
