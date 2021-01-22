package VSFe.item1;

public class SFMMembership {
    private String name;
    private int points;
    private int postalCode;

    SFMMembership() {}
    SFMMembership(String name, int points, int postalCode) {
        this.name = name;
        this.points = points;
        this.postalCode = postalCode;
    }

    public static SFMMembership registerWithName(String name) {
        return new SFMMembership(name, 0, 0);
    }

    public static SFMMembership registerWithNameAndPoints(String name, int points) {
        return new SFMMembership(name, points, 0);
    }

    public static SFMMembership registerWithNameAndPostalCode(String name, int postalCode) {
        return new SFMMembership(name, 0, postalCode);
    }

    public static SFMMembership registerMembership(String name, int points) {
        if (points >= 10000) return new VIPMemberShipWthStatic(name, points);
        else if (points >= 5000) return new GoldMemberShipWthStatic(name, points);
        else if (points >= 2500) return new SilverMemberShipWthStatic(name, points);
        else return new BronzeMemberShipWthStatic(name, points);
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

class VIPMemberShipWthStatic extends SFMMembership {
    public VIPMemberShipWthStatic(String name, int points) {
        super(name, points, 0);
    }
}
class GoldMemberShipWthStatic extends SFMMembership {
    public GoldMemberShipWthStatic(String name, int points) {
        super(name, points, 0);
    }
}
class SilverMemberShipWthStatic extends SFMMembership {
    public SilverMemberShipWthStatic(String name, int points) {
        super(name, points, 0);
    }
}
class BronzeMemberShipWthStatic extends SFMMembership {
    public BronzeMemberShipWthStatic(String name, int points) {
        super(name, points, 0);
    }
}