package VSFe.item2;

public class ChickenTelescopingConstructor {
    private final String chickenName;
    private final String brand;
    private final int price;
    private final int calrories;
    private final Bone boneless;
    private final double review;

    public ChickenTelescopingConstructor(String chickenName, String brand) {
        this(chickenName, brand, 0);
    }

    public ChickenTelescopingConstructor(String chickenName, String brand, int price) {
        this(chickenName, brand, price, 0);
    }

    public ChickenTelescopingConstructor(String chickenName, String brand, int price, int calrories) {
        this(chickenName, brand, price, calrories, Bone.unknown);
    }

    public ChickenTelescopingConstructor(String chickenName, String brand, int price, int calrories, Bone boneless) {
        this(chickenName, brand, price, calrories, boneless, 0);
    }

    public ChickenTelescopingConstructor(String chickenName, String brand, int price, int calrories, Bone boneless, double review) {
        this.chickenName = chickenName;
        this.brand = brand;
        this.price = price;
        this.calrories = calrories;
        this.boneless = boneless;
        this.review = review;
    }
}
