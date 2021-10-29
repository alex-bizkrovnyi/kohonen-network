package kohonen.model;

public class TwoDimensionalVector {
    private double firstDimension;
    private double secondDimension;

    public TwoDimensionalVector(double firstDimension, double secondDimension) {
        this.firstDimension = firstDimension;
        this.secondDimension = secondDimension;
    }

    public TwoDimensionalVector() {
    }

    public double getFirstDimension() {
        return firstDimension;
    }

    public TwoDimensionalVector setFirstDimension(double firstDimension) {
        this.firstDimension = firstDimension;
        return this;
    }

    public double getSecondDimension() {
        return secondDimension;
    }

    public TwoDimensionalVector setSecondDimension(double secondDimension) {
        this.secondDimension = secondDimension;
        return this;
    }
}
