package flower.store;

public enum FlowerColor {
    RED("#FF0000"),
    GREEN("#008000"),
    WHITE("#FFFFFF");

    public final String label;

    private FlowerColor(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}
