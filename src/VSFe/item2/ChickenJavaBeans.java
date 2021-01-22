package VSFe.item2;

public class ChickenJavaBeans {
    private String chickenName = "";
    private String brand = "";
    private int price = 0;
    private int calrories = 0;
    private Bone boneless = Bone.unknown;
    private double review = 0;

    // Constuctor
    public ChickenJavaBeans() {}

    // Setter Methods
    public void setChickenName(String val) { chickenName = val; }
    public void setBrand(String val) { brand = val; }
    public void setPrice(int val) { price = val; }
    public void setCalrories(int val) { calrories = val; }
    public void setboneless(Bone val) { boneless = val; }
    public void setReview(double val) { review = val; }
}
