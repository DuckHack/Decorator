package com.hotel.app;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Main {

    public static void main(String[] args) {
        AbstractCake customCake = new CakeBase();
        System.out.println(customCake.ingrs() + customCake.price(10));

        customCake = new CreamAdder(customCake);
        System.out.println(customCake.ingrs() + customCake.price(10));

        customCake = new ChocolateAdder(customCake);
        System.out.println(customCake.ingrs() + customCake.price(10));

        customCake = new NutsAdder(customCake);
        System.out.println(customCake.ingrs() + customCake.price(10));

    }
}
