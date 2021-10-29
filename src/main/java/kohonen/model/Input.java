package kohonen.model;

import java.util.List;

public class Input {

    private List<TwoDimensionalVector> vectors;
    private String label;

    public String getLabel() {
        return label;
    }

    public Input setLabel(String label) {
        this.label = label;
        return this;
    }

    public List<TwoDimensionalVector> getVectors() {
        return vectors;
    }

    public Input setVectors(List<TwoDimensionalVector> vectors) {
        this.vectors = vectors;
        return this;
    }
}
