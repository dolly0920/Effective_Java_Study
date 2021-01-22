package VSFe.item1;

/**
 * [Effective Java 3rd] item.1 Consider static factory methods instead of constructors.
 * This Driver contains two scenarios
 *
 * #scenarios
 * 1. We want to make two Objects. the one is instance that consists of name and points,
 * and the other is instance that consists of name and postal code.
 * Because public constructor can't overload with same type, so we have to overload using same type, but different order.
 *
 * 2. We want to classify consumer by points.
 * So we made 4 different classes extend Membership class.
 */

public class Driver {
    public static void main(String[] args) {
        // Scenario #1
        SFMMembership SM_S1_1 = SFMMembership.registerWithNameAndPoints("Kim", 12000);
        SFMMembership SM_S1_2 = SFMMembership.registerWithNameAndPostalCode("Park", 26598);

        PCMembership PM_S1_1 = new PCMembership("Kim", 12000);
        PCMembership PM_S1_2 = new PCMembership(26598, "Park");

        // Scenario #2
        SFMMembership SM_S2_1 = SFMMembership.registerMembership("Kim", 12000);
        System.out.println(SM_S2_1);

        PCMembership PM_S2_1 = new PCMembership("Kim", 12000);
        Object PM_S2_2;
        String name = PM_S2_1.getName();
        int points = PM_S2_1.getPoints();

        if(PM_S2_1.getPoints() >= 10000) {
            PM_S2_2 = new VIPMemberShip(name, points);
        } else if(PM_S1_1.getPoints() >= 5000) {
            PM_S2_2 = new GoldMemberShip(name, points);
        } else if(PM_S1_1.getPoints() >- 2500) {
            PM_S2_2 = new SilverMemberShip(name, points);
        } else {
            PM_S2_2 = new BronzeMemberShip(name, points);
        }
        System.out.println(PM_S2_2);
    }
}
