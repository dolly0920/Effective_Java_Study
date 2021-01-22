package VSFe.item3;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationTester {
    public byte[] serialize(Object instance) {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try (bos; ObjectOutputStream oos = new ObjectOutputStream(bos)) {
            oos.writeObject(instance);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bos.toByteArray();
    }

    public Object deserialize(byte[] serializedData) {
        ByteArrayInputStream bis = new ByteArrayInputStream(serializedData);
        try (bis; ObjectInputStream ois = new ObjectInputStream(bis)) {
            return ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        // Test Seialize on StaticFactorySingleton Class.
        StaticFactorySingleton instance = StaticFactorySingleton.getInstance();
        SerializationTester ST = new SerializationTester();
        byte[] serialized = ST.serialize(instance);
        StaticFactorySingleton result = (StaticFactorySingleton)ST.deserialize(serialized);

        System.out.println("instance == result : " + (instance == result));
        System.out.println("instance.equals(result) : " + (instance.equals(result)));

        // Test Serialize on StaticFactorySingleton Class.
        StaticFactorySingletonFixed fixedInstance = StaticFactorySingletonFixed.getInstance();
        SerializationTester fixedST = new SerializationTester();
        byte[] fixedSerialized = fixedST.serialize(instance);
        StaticFactorySingletonFixed fixedResult = (StaticFactorySingletonFixed) fixedST.deserialize(fixedSerialized);

        System.out.println("instance == result : " + (fixedInstance == fixedResult));
        System.out.println("instance.equals(result) : " + (fixedInstance.equals(fixedResult)));
    }
}
