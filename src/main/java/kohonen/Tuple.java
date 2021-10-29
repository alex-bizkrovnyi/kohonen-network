package kohonen;

public class Tuple<R, L> {
    public R right;
    public L left;

    public Tuple(R right, L left) {
        this.right = right;
        this.left = left;
    }

    public R getRight() {
        return right;
    }

    public Tuple<R, L> setRight(R right) {
        this.right = right;
        return this;
    }

    public L getLeft() {
        return left;
    }

    public Tuple<R, L> setLeft(L left) {
        this.left = left;
        return this;
    }
}
