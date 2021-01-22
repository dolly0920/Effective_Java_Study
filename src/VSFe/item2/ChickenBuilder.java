package VSFe.item2;

public class ChickenBuilder {
    private final String chickenName;
    private final String brand;
    private final int price;
    private final int calrories;
    private final Bone boneless;
    private final double review;

    public static class Builder {
        private final String chickenName;
        private final String brand;

        private int price       = 0;
        private int calrories   = 0;
        private Bone boneless   = Bone.unknown;
        private double review   = 0;

        public Builder(String chickenName, String brand) {
            this.chickenName = chickenName;
            this.brand       = brand;
        }

        public Builder price(int val) { price = val; return this; }
        public Builder calrories(int val) { calrories = val; return this; }
        public Builder boneless(Bone val) { boneless = val; return this; }
        public Builder review(double val) { review = val; return this; }

        public ChickenBuilder build() {
            return new ChickenBuilder(this);
        }
    }

    public ChickenBuilder(Builder cb) {
        chickenName     = cb.chickenName;
        brand           = cb.brand;
        price           = cb.price;
        calrories       = cb.calrories;
        boneless        = cb.boneless;
        review          = cb.review;
    }
}
