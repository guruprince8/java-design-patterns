package org.example;

import org.example.singleton.Singleton;
import org.example.singleton.SingletonMap;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!"+ Singleton.INSTANCE);
        System.out.println("Hello world!"+ Singleton.INSTANCE);
        System.out.println(SingletonMap.singletonMap);
        System.out.println(Singleton.class.getName());
    }
}