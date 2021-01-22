package VSFe.item3;

import java.io.Serializable;

public class StaticFactorySingletonFixed implements Serializable {
    private static final StaticFactorySingletonFixed SFSSSingleton = new StaticFactorySingletonFixed();

    private StaticFactorySingletonFixed(){
        if(SFSSSingleton != null) {
            throw new IllegalStateException("This Class cannot construct instance.");
        }
    }

    public static StaticFactorySingletonFixed getInstance() {
        return SFSSSingleton;
    }
    public Object readResolve() {
        return SFSSSingleton;
    }
}
