package VSFe.item1;

public class PCMembership {
    private String name;
    private int points;
    private int postalCode;

    public PCMembership() {}

    public PCMembership(String name) {
        this.name = name;
    }

    public PCMembership(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public PCMembership(int postalCode, String name) {
        this.name = name;
        this.postalCode = postalCode;
    }

    public String getName() { return this.name; }
    public int getPoints() { return this.points; }
    public int getPostalCode() { return this.postalCode; }

    @Override
    public String toString() {
        return "This is " + this.getClass().getName() + " with "
                + this.points + " points.";
    }
}

class VIPMemberShip extends SFMMembership {
    public VIPMemberShip(String name, int points) {
        super(name, points, 0);
    }
}
class GoldMemberShip extends SFMMembership {
    public GoldMemberShip(String name, int points) {
        super(name, points, 0);
    }
}
class SilverMemberShip extends SFMMembership {
    public SilverMemberShip(String name, int points) {
        super(name, points, 0);
    }
}
class BronzeMemberShip extends SFMMembership {
    public BronzeMemberShip(String name, int points) {
        super(name, points, 0);
    }
}