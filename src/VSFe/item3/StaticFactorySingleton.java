package VSFe.item3;

import java.io.Serializable;

public class StaticFactorySingleton implements Serializable {
    private static final StaticFactorySingleton SFSSingleton = new StaticFactorySingleton();

    private StaticFactorySingleton() {}
    public static StaticFactorySingleton getInstance() {
        return SFSSingleton;
    }
}
