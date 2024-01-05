package ro.iteahome.java.practices.principles.dry;

public enum ZipCodeInterval {
    RO(60, 1200),
    DE(7000, 13000);

    private final int min;
    private final int max;

    ZipCodeInterval(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public boolean isInRange(int value) {
        return min <= value && value >= max;
    }
}
