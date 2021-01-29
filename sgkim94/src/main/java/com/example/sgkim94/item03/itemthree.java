package com.example.sgkim94.item03;

/**
 * ITEM3. Guaranteed to be singleton as a private constructor or enum type.
 */
public class itemthree {
    /**
     * Singleton Object
     */
    static final class Singleton {
        private static Singleton INSTANCE = new Singleton();

        private Singleton() {
            throw new IllegalArgumentException("Can`t create new Object");
        }

        static Singleton getInstance() {
            return INSTANCE;
        }
    }


    /**
     * Enum Singleton
     */
    enum EnumSingleton {
        INSTANCE(Singleton.getInstance());

        private Singleton object;

        EnumSingleton(Singleton instance) {
            this.object = instance;
        }

        public EnumSingleton getInstance() {
            return INSTANCE;
        }

        public Singleton getObject() {
            return object;
        }
    }

    public static void main(String[] args) {
        SingletonExample();
        EnumSingletonExample();
    }

    private static void EnumSingletonExample() {
        Singleton object = EnumSingleton.INSTANCE.getObject();
    }

    private static void SingletonExample() {
        Singleton instance = Singleton.getInstance();
    }
}
