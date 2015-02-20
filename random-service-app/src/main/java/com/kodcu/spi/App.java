package com.kodcu.spi;

/**
 * Created by usta on 20.02.2015.
 */
public class App {

    public static void main(String[] args) {

        RandomServiceProvider defaultProvider = RandomServiceProvider.getDefaultProvider();
        System.out.println(defaultProvider.random(1,1000));

        RandomServiceProvider threadedProvider = RandomServiceProvider.getProvider("com.kodcu.ThreadedRandomProvider");
        System.out.println(threadedProvider.random(1,1000));
    }

}
