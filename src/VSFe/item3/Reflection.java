package VSFe.item3;

import java.lang.reflect.Constructor;

public class Reflection {
    public static void main(String[] args) {
        // Test Refelction Constructor Access on StaticFactorySingleton Class.
        try {
            Class SFS = StaticFactorySingleton.class;
            Constructor SFSConstructor = SFS.getDeclaredConstructor();
            SFSConstructor.setAccessible(true);

            Object SFSTemp = SFSConstructor.newInstance();
            StaticFactorySingleton SFSObject = (StaticFactorySingleton) SFSTemp;

            System.out.println(SFSObject);
            System.out.println(StaticFactorySingleton.getInstance());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Test Refelction Constructor Access on StaticFactorySingleton Class.
        try {
            Class SFSS = StaticFactorySingletonFixed.class;
            Constructor SFSSConstructor = SFSS.getDeclaredConstructor();
            SFSSConstructor.setAccessible(true);

            Object SFSSTemp = SFSSConstructor.newInstance();
            StaticFactorySingleton SFSSObject = (StaticFactorySingleton) SFSSTemp;

            System.out.println(SFSSObject);
            System.out.println(StaticFactorySingletonFixed.getInstance());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
