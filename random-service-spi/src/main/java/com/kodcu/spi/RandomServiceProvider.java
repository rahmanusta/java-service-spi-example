package com.kodcu.spi;

import java.util.ServiceLoader;

/**
 * Created by usta on 20.02.2015.
 * <p>
 * This services generates random Integer via provided start and end
 */
public interface RandomServiceProvider {

    public Integer random(int start, int end);

    public static RandomServiceProvider getProvider(String providerName) {
        ServiceLoader<RandomServiceProvider> serviceLoader = ServiceLoader.load(RandomServiceProvider.class);

        for (RandomServiceProvider provider : serviceLoader) {
            String className = provider.getClass().getName();
            if (providerName.equals(className))
                return provider;
        }

        throw new RuntimeException(providerName + " provider is not found!");
    }

    public static RandomServiceProvider getDefaultProvider() {
        return getProvider("com.kodcu.StandardRandomProvider");
    }

}
