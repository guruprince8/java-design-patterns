package org.example.singleton;

public class Singleton {
    public static Singleton INSTANCE;
    private static Singleton INSTANCE1;

    static {
        System.out.println("loading static block");
        INSTANCE = new Singleton();
        SingletonMap.singletonMap.put(INSTANCE.getClass().getName(),INSTANCE);
    }

    public static Singleton getInstance(){
        if(Singleton.INSTANCE1 == null)
            INSTANCE1 = new Singleton();
        return INSTANCE1;
    }

}
